package cz.radekm.records

private val MaxFields = 22

private fun record(typeParams: List<String>) = "Record${typeParams.size}" +
        if (typeParams.isEmpty()) "" else typeParams.joinToString(", ", "<", ">")

private fun generatePosInterfaces() {
    for (numFields in 1..MaxFields) {
        val code = "interface Pos$numFields<F : Field<*>, Rest : Record>"
        println(code)
    }
}

private fun generateRecordClasses() {
    for (numFields in 1..MaxFields) {
        val posInterfaces = (1..numFields).map { i ->
            val restTypeParams = (1..numFields).filter { it != i } .map { "F$it" }
            val rest = record(restTypeParams)
            "Pos$i<F$i, $rest>"
        }
        val typeParams = (1..numFields).map { "F$it : Field<*>" }
        val constructorParams = (1..numFields).map { "b$it : Binding<*, F$it>" }
        val dataConstructorArgs = (1..numFields).map { "b$it" }
        val plusFun = if (numFields < MaxFields) {
            """
                operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): ${record((1..numFields).map { "F$it" } + "F")} = 
                    Record${numFields + 1}(data + binding)
            """
        } else ""
        val copyFun =
            """
                fun copy(vararg changes: Binding<*, *>): ${record((1..numFields).map { "F$it" })} = 
                    Record${numFields}(data.copy(*changes))
            """
        val code = """
            class ${record(typeParams)} constructor(data: RecordData) : Record(data), ${posInterfaces.joinToString()} {
                constructor(${constructorParams.joinToString()}) : this(
                    RecordData(${dataConstructorArgs.joinToString()})
                ) 
                $copyFun
                $plusFun
            }
        """.trimIndent()
        println(code)
    }
}

private fun generateRecordFunctions() {
    for (numFields in 1..MaxFields) {
        val typeParams = (1..numFields).map { "F$it : Field<*>" }
        val functionParams = (1..numFields).map { "b$it : Binding<*, F$it>" }
        val constructorArgs = (1..numFields).map { "b$it" }
        val code = """
            fun <${typeParams.joinToString()}> record(${functionParams.joinToString()}): ${record((1..numFields).map { "F$it" })} =
                Record${numFields}(${constructorArgs.joinToString()})
        """.trimIndent()
        println(code)
    }
}

private fun generateGetFunctions() {
    for (numFields in 1..MaxFields) {
        val code = """
            @Suppress("UNCHECKED_CAST")
            operator fun <T, F : Field<T>> Pos$numFields<F, *>.get(field: F): T = (this as Record).data[field] as T
        """.trimIndent()
        println(code)
    }
}

private fun generateToRecordFunction() {
    val cases = (1..MaxFields)
        .joinToString(" \n") {
            val typeArgs = List(it) { "Field<*>" }
            "$it -> Record$it<${typeArgs.joinToString()}>(this)"
        }
        .replaceIndent(" ".repeat(12))
        .trimStart()
    val code = """
        fun RecordData.toRecord(): Record = when (this.size) {
            0 -> Record0
            $cases
            else -> error("Too many fields ${'$'}{this.size}")
        }
    """.trimIndent()
    println(code)
}

private fun generateMinusFunctions() {
    for (numFields in 1..MaxFields) {
        val code = """
            @Suppress("UNCHECKED_CAST")
            operator fun <F : Field<*>, Rest : Record> Pos$numFields<F, Rest>.minus(field: F): Rest =
                ((this as Record).data - field).toRecord() as Rest
        """.trimIndent()
        println(code)
    }
}

object Generator {
    @JvmStatic
    fun main(args: Array<String>) {
        generatePosInterfaces()
        generateRecordClasses()
        generateRecordFunctions()
        generateGetFunctions()
        generateToRecordFunction()
        generateMinusFunctions()
    }
}
