# Anonymous records for Kotlin

## Build Configuration

To your `build.gradle.kts` add:

```kotlin
repositories {
    maven(url = "https://dl.bintray.com/radekm/maven")
}

dependencies {
    implementation("cz.radekm.records:anonymous-records-kotlin:0.1")
}
```

## Motivation

In Kotlin data classes allow you to group a bunch of values together:

```kotlin
data class User(
    val name: String,
    val group: String,
)
```

If you want to add another field (eg. `id`) then you have to create a new data class:

```kotlin
data class UserWithId(
    val id: Int,
    val name: String,
    val group: String,
)
```

You have to invent another name and copy all fields from the previous one.
To avoid copying all fields you can nest `User` class inside `UserWithId`:

```kotlin
data class UserWithId(
    val id: Int,
    val user: User,
)
```

Nesting removes code duplication but makes `UserWithId` less pleasant to work with.

## Anonymous records to the rescue

This library proposes another solution. But first you need to declare all fields:

```kotlin
import cz.radekm.records.*

object id : Field<Int>("id", IntType)
object name : Field<String>("name", StringType)
object group : Field<String>("group", StringType)
```

Then you can create records in your functions:

```kotlin
val user = record(name to "Joanna", group to "developers")
```

Fields can be added by operator `+`:

```kotlin
val userWithId = user + (id to 3)
```

Records are immutable, so you cannot change value of a field,
instead you can create a new record with new values:

```kotlin
val bossWithId = userWithId.copy(group to "cto")
```

Fields can be removed via `-` and values can be retrieved by indexer:

```kotlin
val boss = bossWithId - id
val group = boss[group]
```

## Limitations

Other languages like F#, TypeScript or Elm have much better built-in support
for anonymous records or even for extensible records. If you need to stay on JVM
you can consider Scala with its excellent library Shapeless which provides
much more than this library.

If want to still use this library you should know about its limitations:
- Order of fields in record matters!
  `record(id to 1, name to "John")` and `record(name to "John", id to 1)`
  are two different records.
- You cannot easily write function constrained to work
  on all records with certain fields.
  Eg. write a function which works on any record with fields `name`
  and `id`. To do this for single field you can see implementation
  of indexer (one function for each `PosX` interface).
- `copy` can be called even with fields which don't belong to the original
  record. It will throw exception.  

## Alternatives in Kotlin

If you want to use inheritance you must avoid data classes.
By avoiding data classes you lose automatic implementation
of `equals`, `hashCode`, `toString` and `copy`.
First 3 can be easily recovered by storing property values
in the `Map`:

```kotlin
import kotlin.reflect.KProperty

class PropertyDelegate<T>() {
    operator fun getValue(rec: Record, prop: KProperty<*>): T {
        @Suppress("UNCHECKED_CAST")
        return rec.data[prop.name] as T
    }
    operator fun setValue(rec: Record, prop: KProperty<*>, v: T) {
        rec.data[prop.name] = v
    }
}

class DelegateProvider<T> {
    operator fun provideDelegate(
        record: Record,
        prop: KProperty<*>
    ): PropertyDelegate<T> {
        record.fields.add(prop.name)
        return PropertyDelegate()
    }
}

typealias FieldName = String

abstract class Record {
    internal val fields = mutableSetOf<FieldName>()
    internal val data = mutableMapOf<FieldName, Any?>()
    fun <T> field(): DelegateProvider<T> = DelegateProvider()

    override fun equals(other: Any?): Boolean = other is Record && other.fields == fields && other.data == data
    override fun hashCode(): Int = arrayOf(fields, data).contentHashCode()
    override fun toString(): String = fields.toList().sorted().joinToString(prefix = "Record(", postfix = ")") { field ->
        if (field in data) "$field -> ${data[field]}"
        else "$field -> <undefined>"
    }
}
```

Now you can define records for users:

```kotlin
open class User : Record() {
    var name: String by field()
    var group: String by field()
}

open class UserWithId : User() {
    var id: Int by field()
}
```

This is simpler than our library and has advantage that
you can use `UserWithId` in place of `User`.
 
On the other hand code for creating a new record is slightly longer:

```kotlin
val user = User().apply {
    name = "Joanna"
    group = "dev"
}
```

The real problem is that constructor which would force you
at compile time to initialize all fields is not created
and you can easily forget to initialize a field:

```kotlin
val userWithId = UserWithId().apply {
    name = "Joanna"
    group = "dev"
}
```

Operators `+`, `-` and `copy` function are missing.
The inheritance allows you to use `UserWithId` in place of `User`
but not vice versa. If you have `User` and need `UserWithId`
you have to create it from scratch.
