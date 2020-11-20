package cz.radekm.records

import org.junit.jupiter.api.Test
import java.math.BigDecimal
import kotlin.test.assertEquals

class UsageTest {
    object contract: Field<String>("contract", StringType)
    object price: Field<BigDecimal>("price", DecimalType)
    object quantity: Field<BigDecimal>("quantity", DecimalType)
    object side: Field<String>("side", StringType)
    object type: Field<String>("type", StringType)

    @Test
    fun sample() {
        val order = record(
            contract to "HOUR_10",
            price to "1".toBigDecimal(),
            quantity to "2".toBigDecimal(),
            side to "sell",
        )

        assertEquals(
            "contract -> HOUR_10, price -> 1, quantity -> 2, side -> sell",
            order.data.toString(),
        )
        assertEquals(BigDecimal.ONE, order[price])

        val extendedOrder = order + (type to "external")
        assertEquals(
            "contract -> HOUR_10, price -> 1, quantity -> 2, side -> sell, type -> external",
            extendedOrder.data.toString(),
        )

        val extendedOrder2 = extendedOrder.copy(quantity to "7".toBigDecimal())
        assertEquals("7".toBigDecimal(), extendedOrder2[quantity])

        val order2 = extendedOrder2 - type
        assertEquals(
            "contract -> HOUR_10, price -> 1, quantity -> 7, side -> sell",
            order2.data.toString(),
        )
    }
}
