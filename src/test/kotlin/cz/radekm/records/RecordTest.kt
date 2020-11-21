package cz.radekm.records

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertFailsWith

class RecordTest {
    object foo : Field<Int>("foo", IntType)
    object bar : Field<Int>("bar", IntType)

    @Test
    fun `records with same fields in same order are equal if values are equal`() {
        val ones = record(foo to 1, bar to 1)
        val onesAgain = record(foo to 1, bar to 1)
        val oneTwo = record(foo to 1, bar to 2)
        val twoOne = record(foo to 2, bar to 1)

        assertEquals(ones, onesAgain)
        assertNotEquals(ones, oneTwo)
        assertNotEquals(ones, twoOne)
        assertNotEquals(oneTwo, twoOne)
    }

    @Test
    fun `records with fields in different order are not equal`() {
        val ones: Record = record(foo to 1, bar to 1)
        val onesSwapped: Record = record(bar to 1, foo to 1)

        assertNotEquals(ones, onesSwapped)
    }

    @Test
    fun `duplicate fields are disallowed at runtime`() {
        assertFailsWith<Exception> {
            record(foo to 1, foo to 2)
        }
    }

    @Test
    fun `record can be constructed by adding fields`() {
        val r0 = record()
        val r1 = r0 + (foo to 4)
        val r2 = r1 + (bar to 2)

        assertEquals(record(foo to 4, bar to 2), r2)
    }

    @Test
    fun `plus operator checks for duplicate fields`() {
        val r0 = record()
        val r1 = r0 + (foo to 4)

        assertFailsWith<Exception> {
            r1 + (foo to 2)
        }
    }
}
