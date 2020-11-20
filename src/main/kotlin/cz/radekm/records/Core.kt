package cz.radekm.records

import java.math.BigDecimal
import java.time.Instant
import java.util.concurrent.atomic.AtomicInteger

// Notes:
//
// Interfaces `PosX<F : Field<*>, Rest : Record>` say that field `F` is at position `X`
// and if we remove it then resulting record will have type `Rest`
//
// `get` functions cannot be members of `RecordX` classes.
// The problem are the signatures `get(field: F)` which differ only in generic parameter
// (in class these parameters would be `F1`, `F2`, ...)  and since generics don't exist on JVM all `X`
// `get` functions would be compiled to the same signature.
// Same for `minus`.
//
// On the other hand `plus` can be member. Because it's not extension for `PosX` interface.
//
// It's hard to write functions which manipulate with multiple fields at once.
// I suspect that if we manipulate with `n` fields we would need `O(2^n)` or `O(n!)` overloads
// which is too much.
// Instead we could make `copy` safer if it works by `one` field.
// Eg. `record.copy(f1 to v1)(f2 to v2)(f3 to v3).done`.
// This could be probably implemented by making `copy` `val` with type `Copier<Dest, Source>`,
// where `Dest` and `Source` type parameters are records.
// `Copier` would implement `operator fun <T, F : Field<T>> invoke(b: Binding<T, F>)` which returns
// new `Copier<Dest + F, Source - F>`. And `done` would simply return `Dest`.
// Such `invoke` would need both - to remove field from `Source` and add field to `Dest`
// so we would probably need `O(X * Y)` overloads.

// TODO Consider removing this.
open class FieldType<T>()

object StringType : FieldType<String>()
object IntType : FieldType<Int>()
object LongType : FieldType<Long>()
object DecimalType : FieldType<BigDecimal>()
object BooleanType : FieldType<Boolean>()
object InstantType : FieldType<Instant>()

// TODO Support for kotlinx.serialization.
//      It can be done via `FieldType` or by passing `KSerializer` (and then we don't need `FieldType`).
open class Field<T>(val id: String, val type: FieldType<T>) {
    /**
     * Unique among all fields in the current program.
     * Note: Different run of the same program may result in different `uniqueUnstableId`.
     */
    val uniqueUnstableId = fieldsCreated.getAndIncrement()

    companion object {
        private val fieldsCreated = AtomicInteger(0)
    }

    override fun equals(other: Any?): Boolean = other is Field<*> && other.uniqueUnstableId == uniqueUnstableId
    override fun hashCode(): Int = uniqueUnstableId
}

// `to` cannot be member function of `Field` because its result type contains `F` which is self type
// which doesn't exist in Kotlin. If we wanted to put it inside `Field` class we would need to add
// a new type parameter to `Field` and user would be obliged to instantiate it to self type.
/**
 * Create a binding.
 */
infix fun <T, F : Field<T>> F.to(value: T): Binding<T, F> = Binding(this, value)

class Binding<T, F : Field<T>>(val field: F, val value: T)

// TODO Equality and hashing.
// TODO Functions for adding and removing multiple fields at once.
class RecordData private constructor(private val bindings: Array<Binding<*, *>>) {
    val size: Int
        get() = bindings.size

    operator fun get(field: Field<*>): Any? {
        for (b in bindings) {
            if (b.field == field)
                return b.value
        }
        return null
    }
    operator fun plus(binding: Binding<*, *>): RecordData {
        val newBindings = Array(bindings.size + 1) { i ->
            if (i < bindings.size) {
                if (bindings[i].field == binding.field) error("Field ${binding.field.id} is already in the record")
                else bindings[i]
            } else binding
        }
        return RecordData(newBindings)
    }
    operator fun minus(field: Field<*>): RecordData {
        check(bindings.size > 0) { "Cannot remove field ${field.id} from empty record" }
        var found = 0
        val newBindings = Array(bindings.size - 1) { i ->
            if (bindings[i].field == field) found++
            bindings[i + found]
        }
        check(found == 1 || bindings.last().field == field) { "Field ${field.id} is not present" }
        return RecordData(newBindings)
    }
    fun copy(vararg changes: Binding<*, *>): RecordData {
        val newBindings = bindings.clone()
        outer@ for (ch in changes) {
            for (i in newBindings.indices) {
                if (newBindings[i].field == ch.field) {
                    newBindings[i] = ch
                    continue@outer
                }
            }
            error("Cannot add new field ${ch.field.id} when copying - use operator plus")
        }
        return RecordData(newBindings)
    }

    override fun toString(): String = bindings.joinToString { "${it.field.id} -> ${it.value}" }

    companion object {
        operator fun invoke(vararg bindings: Binding<*, *>): RecordData {
            // Deal with variance.
            @Suppress("UNCHECKED_CAST")
            bindings as Array<Binding<*, *>>

            require(bindings.distinctBy { it.field }.size == bindings.size) {
                "Duplicate fields in record: ${bindings.map { it.field.id }}"
            }
            return RecordData(bindings)
        }
    }
}

open class Record protected constructor(val data: RecordData) {
    override fun toString(): String = "Record($data)"
}

object Record0 : Record(RecordData()) {
    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record1<F> = Record1(data + binding)
}
