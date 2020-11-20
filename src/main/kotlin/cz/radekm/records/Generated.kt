package cz.radekm.records

interface Pos1<F : Field<*>, Rest : Record>
interface Pos2<F : Field<*>, Rest : Record>
interface Pos3<F : Field<*>, Rest : Record>
interface Pos4<F : Field<*>, Rest : Record>
interface Pos5<F : Field<*>, Rest : Record>
interface Pos6<F : Field<*>, Rest : Record>
interface Pos7<F : Field<*>, Rest : Record>
interface Pos8<F : Field<*>, Rest : Record>
interface Pos9<F : Field<*>, Rest : Record>
interface Pos10<F : Field<*>, Rest : Record>
interface Pos11<F : Field<*>, Rest : Record>
interface Pos12<F : Field<*>, Rest : Record>
interface Pos13<F : Field<*>, Rest : Record>
interface Pos14<F : Field<*>, Rest : Record>
interface Pos15<F : Field<*>, Rest : Record>
interface Pos16<F : Field<*>, Rest : Record>
interface Pos17<F : Field<*>, Rest : Record>
interface Pos18<F : Field<*>, Rest : Record>
interface Pos19<F : Field<*>, Rest : Record>
interface Pos20<F : Field<*>, Rest : Record>
interface Pos21<F : Field<*>, Rest : Record>
interface Pos22<F : Field<*>, Rest : Record>
class Record1<F1 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record0> {
    constructor(b1 : Binding<*, F1>) : this(
        RecordData(b1)
    )

    fun copy(vararg changes: Binding<*, *>): Record1<F1> =
        Record1(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record2<F1, F> =
        Record2(data + binding)

}
class Record2<F1 : Field<*>, F2 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record1<F2>>, Pos2<F2, Record1<F1>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>) : this(
        RecordData(b1, b2)
    )

    fun copy(vararg changes: Binding<*, *>): Record2<F1, F2> =
        Record2(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record3<F1, F2, F> =
        Record3(data + binding)

}
class Record3<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record2<F2, F3>>, Pos2<F2, Record2<F1, F3>>, Pos3<F3, Record2<F1, F2>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>) : this(
        RecordData(b1, b2, b3)
    )

    fun copy(vararg changes: Binding<*, *>): Record3<F1, F2, F3> =
        Record3(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record4<F1, F2, F3, F> =
        Record4(data + binding)

}
class Record4<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record3<F2, F3, F4>>, Pos2<F2, Record3<F1, F3, F4>>, Pos3<F3, Record3<F1, F2, F4>>, Pos4<F4, Record3<F1, F2, F3>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>) : this(
        RecordData(b1, b2, b3, b4)
    )

    fun copy(vararg changes: Binding<*, *>): Record4<F1, F2, F3, F4> =
        Record4(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record5<F1, F2, F3, F4, F> =
        Record5(data + binding)

}
class Record5<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record4<F2, F3, F4, F5>>, Pos2<F2, Record4<F1, F3, F4, F5>>, Pos3<F3, Record4<F1, F2, F4, F5>>, Pos4<F4, Record4<F1, F2, F3, F5>>, Pos5<F5, Record4<F1, F2, F3, F4>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>) : this(
        RecordData(b1, b2, b3, b4, b5)
    )

    fun copy(vararg changes: Binding<*, *>): Record5<F1, F2, F3, F4, F5> =
        Record5(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record6<F1, F2, F3, F4, F5, F> =
        Record6(data + binding)

}
class Record6<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record5<F2, F3, F4, F5, F6>>, Pos2<F2, Record5<F1, F3, F4, F5, F6>>, Pos3<F3, Record5<F1, F2, F4, F5, F6>>, Pos4<F4, Record5<F1, F2, F3, F5, F6>>, Pos5<F5, Record5<F1, F2, F3, F4, F6>>, Pos6<F6, Record5<F1, F2, F3, F4, F5>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>) : this(
        RecordData(b1, b2, b3, b4, b5, b6)
    )

    fun copy(vararg changes: Binding<*, *>): Record6<F1, F2, F3, F4, F5, F6> =
        Record6(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record7<F1, F2, F3, F4, F5, F6, F> =
        Record7(data + binding)

}
class Record7<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record6<F2, F3, F4, F5, F6, F7>>, Pos2<F2, Record6<F1, F3, F4, F5, F6, F7>>, Pos3<F3, Record6<F1, F2, F4, F5, F6, F7>>, Pos4<F4, Record6<F1, F2, F3, F5, F6, F7>>, Pos5<F5, Record6<F1, F2, F3, F4, F6, F7>>, Pos6<F6, Record6<F1, F2, F3, F4, F5, F7>>, Pos7<F7, Record6<F1, F2, F3, F4, F5, F6>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7)
    )

    fun copy(vararg changes: Binding<*, *>): Record7<F1, F2, F3, F4, F5, F6, F7> =
        Record7(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record8<F1, F2, F3, F4, F5, F6, F7, F> =
        Record8(data + binding)

}
class Record8<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record7<F2, F3, F4, F5, F6, F7, F8>>, Pos2<F2, Record7<F1, F3, F4, F5, F6, F7, F8>>, Pos3<F3, Record7<F1, F2, F4, F5, F6, F7, F8>>, Pos4<F4, Record7<F1, F2, F3, F5, F6, F7, F8>>, Pos5<F5, Record7<F1, F2, F3, F4, F6, F7, F8>>, Pos6<F6, Record7<F1, F2, F3, F4, F5, F7, F8>>, Pos7<F7, Record7<F1, F2, F3, F4, F5, F6, F8>>, Pos8<F8, Record7<F1, F2, F3, F4, F5, F6, F7>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8)
    )

    fun copy(vararg changes: Binding<*, *>): Record8<F1, F2, F3, F4, F5, F6, F7, F8> =
        Record8(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record9<F1, F2, F3, F4, F5, F6, F7, F8, F> =
        Record9(data + binding)

}
class Record9<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record8<F2, F3, F4, F5, F6, F7, F8, F9>>, Pos2<F2, Record8<F1, F3, F4, F5, F6, F7, F8, F9>>, Pos3<F3, Record8<F1, F2, F4, F5, F6, F7, F8, F9>>, Pos4<F4, Record8<F1, F2, F3, F5, F6, F7, F8, F9>>, Pos5<F5, Record8<F1, F2, F3, F4, F6, F7, F8, F9>>, Pos6<F6, Record8<F1, F2, F3, F4, F5, F7, F8, F9>>, Pos7<F7, Record8<F1, F2, F3, F4, F5, F6, F8, F9>>, Pos8<F8, Record8<F1, F2, F3, F4, F5, F6, F7, F9>>, Pos9<F9, Record8<F1, F2, F3, F4, F5, F6, F7, F8>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9)
    )

    fun copy(vararg changes: Binding<*, *>): Record9<F1, F2, F3, F4, F5, F6, F7, F8, F9> =
        Record9(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record10<F1, F2, F3, F4, F5, F6, F7, F8, F9, F> =
        Record10(data + binding)

}
class Record10<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record9<F2, F3, F4, F5, F6, F7, F8, F9, F10>>, Pos2<F2, Record9<F1, F3, F4, F5, F6, F7, F8, F9, F10>>, Pos3<F3, Record9<F1, F2, F4, F5, F6, F7, F8, F9, F10>>, Pos4<F4, Record9<F1, F2, F3, F5, F6, F7, F8, F9, F10>>, Pos5<F5, Record9<F1, F2, F3, F4, F6, F7, F8, F9, F10>>, Pos6<F6, Record9<F1, F2, F3, F4, F5, F7, F8, F9, F10>>, Pos7<F7, Record9<F1, F2, F3, F4, F5, F6, F8, F9, F10>>, Pos8<F8, Record9<F1, F2, F3, F4, F5, F6, F7, F9, F10>>, Pos9<F9, Record9<F1, F2, F3, F4, F5, F6, F7, F8, F10>>, Pos10<F10, Record9<F1, F2, F3, F4, F5, F6, F7, F8, F9>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10)
    )

    fun copy(vararg changes: Binding<*, *>): Record10<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10> =
        Record10(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record11<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F> =
        Record11(data + binding)

}
class Record11<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record10<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11>>, Pos2<F2, Record10<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11>>, Pos3<F3, Record10<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11>>, Pos4<F4, Record10<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11>>, Pos5<F5, Record10<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11>>, Pos6<F6, Record10<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11>>, Pos7<F7, Record10<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11>>, Pos8<F8, Record10<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11>>, Pos9<F9, Record10<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11>>, Pos10<F10, Record10<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11>>, Pos11<F11, Record10<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11)
    )

    fun copy(vararg changes: Binding<*, *>): Record11<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11> =
        Record11(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record12<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F> =
        Record12(data + binding)

}
class Record12<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record11<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12>>, Pos2<F2, Record11<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12>>, Pos3<F3, Record11<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12>>, Pos4<F4, Record11<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12>>, Pos5<F5, Record11<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12>>, Pos6<F6, Record11<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12>>, Pos7<F7, Record11<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12>>, Pos8<F8, Record11<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12>>, Pos9<F9, Record11<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12>>, Pos10<F10, Record11<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12>>, Pos11<F11, Record11<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12>>, Pos12<F12, Record11<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12)
    )

    fun copy(vararg changes: Binding<*, *>): Record12<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12> =
        Record12(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record13<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F> =
        Record13(data + binding)

}
class Record13<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record12<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13>>, Pos2<F2, Record12<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13>>, Pos3<F3, Record12<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13>>, Pos4<F4, Record12<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12, F13>>, Pos5<F5, Record12<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12, F13>>, Pos6<F6, Record12<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12, F13>>, Pos7<F7, Record12<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12, F13>>, Pos8<F8, Record12<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12, F13>>, Pos9<F9, Record12<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12, F13>>, Pos10<F10, Record12<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12, F13>>, Pos11<F11, Record12<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12, F13>>, Pos12<F12, Record12<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F13>>, Pos13<F13, Record12<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13)
    )

    fun copy(vararg changes: Binding<*, *>): Record13<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13> =
        Record13(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record14<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F> =
        Record14(data + binding)

}
class Record14<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record13<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14>>, Pos2<F2, Record13<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14>>, Pos3<F3, Record13<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14>>, Pos4<F4, Record13<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14>>, Pos5<F5, Record13<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12, F13, F14>>, Pos6<F6, Record13<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12, F13, F14>>, Pos7<F7, Record13<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12, F13, F14>>, Pos8<F8, Record13<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12, F13, F14>>, Pos9<F9, Record13<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12, F13, F14>>, Pos10<F10, Record13<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12, F13, F14>>, Pos11<F11, Record13<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12, F13, F14>>, Pos12<F12, Record13<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F13, F14>>, Pos13<F13, Record13<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F14>>, Pos14<F14, Record13<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14)
    )

    fun copy(vararg changes: Binding<*, *>): Record14<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14> =
        Record14(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record15<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F> =
        Record15(data + binding)

}
class Record15<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record14<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15>>, Pos2<F2, Record14<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15>>, Pos3<F3, Record14<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15>>, Pos4<F4, Record14<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15>>, Pos5<F5, Record14<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15>>, Pos6<F6, Record14<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12, F13, F14, F15>>, Pos7<F7, Record14<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12, F13, F14, F15>>, Pos8<F8, Record14<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12, F13, F14, F15>>, Pos9<F9, Record14<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12, F13, F14, F15>>, Pos10<F10, Record14<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12, F13, F14, F15>>, Pos11<F11, Record14<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12, F13, F14, F15>>, Pos12<F12, Record14<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F13, F14, F15>>, Pos13<F13, Record14<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F14, F15>>, Pos14<F14, Record14<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F15>>, Pos15<F15, Record14<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15)
    )

    fun copy(vararg changes: Binding<*, *>): Record15<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15> =
        Record15(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F> =
        Record16(data + binding)

}
class Record16<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record15<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16>>, Pos2<F2, Record15<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16>>, Pos3<F3, Record15<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16>>, Pos4<F4, Record15<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16>>, Pos5<F5, Record15<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16>>, Pos6<F6, Record15<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16>>, Pos7<F7, Record15<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12, F13, F14, F15, F16>>, Pos8<F8, Record15<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12, F13, F14, F15, F16>>, Pos9<F9, Record15<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12, F13, F14, F15, F16>>, Pos10<F10, Record15<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12, F13, F14, F15, F16>>, Pos11<F11, Record15<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12, F13, F14, F15, F16>>, Pos12<F12, Record15<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F13, F14, F15, F16>>, Pos13<F13, Record15<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F14, F15, F16>>, Pos14<F14, Record15<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F15, F16>>, Pos15<F15, Record15<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F16>>, Pos16<F16, Record15<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16)
    )

    fun copy(vararg changes: Binding<*, *>): Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16> =
        Record16(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F> =
        Record17(data + binding)

}
class Record17<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record16<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17>>, Pos2<F2, Record16<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17>>, Pos3<F3, Record16<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17>>, Pos4<F4, Record16<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17>>, Pos5<F5, Record16<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17>>, Pos6<F6, Record16<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17>>, Pos7<F7, Record16<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17>>, Pos8<F8, Record16<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12, F13, F14, F15, F16, F17>>, Pos9<F9, Record16<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12, F13, F14, F15, F16, F17>>, Pos10<F10, Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12, F13, F14, F15, F16, F17>>, Pos11<F11, Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12, F13, F14, F15, F16, F17>>, Pos12<F12, Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F13, F14, F15, F16, F17>>, Pos13<F13, Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F14, F15, F16, F17>>, Pos14<F14, Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F15, F16, F17>>, Pos15<F15, Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F16, F17>>, Pos16<F16, Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F17>>, Pos17<F17, Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17)
    )

    fun copy(vararg changes: Binding<*, *>): Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17> =
        Record17(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F> =
        Record18(data + binding)

}
class Record18<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>, F18 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record17<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18>>, Pos2<F2, Record17<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18>>, Pos3<F3, Record17<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18>>, Pos4<F4, Record17<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18>>, Pos5<F5, Record17<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18>>, Pos6<F6, Record17<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18>>, Pos7<F7, Record17<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18>>, Pos8<F8, Record17<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18>>, Pos9<F9, Record17<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12, F13, F14, F15, F16, F17, F18>>, Pos10<F10, Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12, F13, F14, F15, F16, F17, F18>>, Pos11<F11, Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12, F13, F14, F15, F16, F17, F18>>, Pos12<F12, Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F13, F14, F15, F16, F17, F18>>, Pos13<F13, Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F14, F15, F16, F17, F18>>, Pos14<F14, Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F15, F16, F17, F18>>, Pos15<F15, Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F16, F17, F18>>, Pos16<F16, Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F17, F18>>, Pos17<F17, Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F18>>, Pos18<F18, Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>, b18 : Binding<*, F18>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18)
    )

    fun copy(vararg changes: Binding<*, *>): Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18> =
        Record18(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F> =
        Record19(data + binding)

}
class Record19<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>, F18 : Field<*>, F19 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record18<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos2<F2, Record18<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos3<F3, Record18<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos4<F4, Record18<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos5<F5, Record18<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos6<F6, Record18<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos7<F7, Record18<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos8<F8, Record18<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos9<F9, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos10<F10, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos11<F11, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12, F13, F14, F15, F16, F17, F18, F19>>, Pos12<F12, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F13, F14, F15, F16, F17, F18, F19>>, Pos13<F13, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F14, F15, F16, F17, F18, F19>>, Pos14<F14, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F15, F16, F17, F18, F19>>, Pos15<F15, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F16, F17, F18, F19>>, Pos16<F16, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F17, F18, F19>>, Pos17<F17, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F18, F19>>, Pos18<F18, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F19>>, Pos19<F19, Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>, b18 : Binding<*, F18>, b19 : Binding<*, F19>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19)
    )

    fun copy(vararg changes: Binding<*, *>): Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19> =
        Record19(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F> =
        Record20(data + binding)

}
class Record20<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>, F18 : Field<*>, F19 : Field<*>, F20 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record19<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos2<F2, Record19<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos3<F3, Record19<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos4<F4, Record19<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos5<F5, Record19<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos6<F6, Record19<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos7<F7, Record19<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos8<F8, Record19<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos9<F9, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos10<F10, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos11<F11, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos12<F12, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F13, F14, F15, F16, F17, F18, F19, F20>>, Pos13<F13, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F14, F15, F16, F17, F18, F19, F20>>, Pos14<F14, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F15, F16, F17, F18, F19, F20>>, Pos15<F15, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F16, F17, F18, F19, F20>>, Pos16<F16, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F17, F18, F19, F20>>, Pos17<F17, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F18, F19, F20>>, Pos18<F18, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F19, F20>>, Pos19<F19, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F20>>, Pos20<F20, Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>, b18 : Binding<*, F18>, b19 : Binding<*, F19>, b20 : Binding<*, F20>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20)
    )

    fun copy(vararg changes: Binding<*, *>): Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20> =
        Record20(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F> =
        Record21(data + binding)

}
class Record21<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>, F18 : Field<*>, F19 : Field<*>, F20 : Field<*>, F21 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record20<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos2<F2, Record20<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos3<F3, Record20<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos4<F4, Record20<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos5<F5, Record20<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos6<F6, Record20<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos7<F7, Record20<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos8<F8, Record20<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos9<F9, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos10<F10, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos11<F11, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos12<F12, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F13, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos13<F13, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F14, F15, F16, F17, F18, F19, F20, F21>>, Pos14<F14, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F15, F16, F17, F18, F19, F20, F21>>, Pos15<F15, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F16, F17, F18, F19, F20, F21>>, Pos16<F16, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F17, F18, F19, F20, F21>>, Pos17<F17, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F18, F19, F20, F21>>, Pos18<F18, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F19, F20, F21>>, Pos19<F19, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F20, F21>>, Pos20<F20, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F21>>, Pos21<F21, Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>, b18 : Binding<*, F18>, b19 : Binding<*, F19>, b20 : Binding<*, F20>, b21 : Binding<*, F21>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21)
    )

    fun copy(vararg changes: Binding<*, *>): Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21> =
        Record21(data.copy(*changes))


    operator fun <T, F : Field<T>> plus(binding: Binding<T, F>): Record22<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F> =
        Record22(data + binding)

}
class Record22<F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>, F18 : Field<*>, F19 : Field<*>, F20 : Field<*>, F21 : Field<*>, F22 : Field<*>> constructor(data: RecordData) : Record(data), Pos1<F1, Record21<F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos2<F2, Record21<F1, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos3<F3, Record21<F1, F2, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos4<F4, Record21<F1, F2, F3, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos5<F5, Record21<F1, F2, F3, F4, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos6<F6, Record21<F1, F2, F3, F4, F5, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos7<F7, Record21<F1, F2, F3, F4, F5, F6, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos8<F8, Record21<F1, F2, F3, F4, F5, F6, F7, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos9<F9, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos10<F10, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos11<F11, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos12<F12, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos13<F13, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F14, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos14<F14, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F15, F16, F17, F18, F19, F20, F21, F22>>, Pos15<F15, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F16, F17, F18, F19, F20, F21, F22>>, Pos16<F16, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F17, F18, F19, F20, F21, F22>>, Pos17<F17, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F18, F19, F20, F21, F22>>, Pos18<F18, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F19, F20, F21, F22>>, Pos19<F19, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F20, F21, F22>>, Pos20<F20, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F21, F22>>, Pos21<F21, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F22>>, Pos22<F22, Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21>> {
    constructor(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>, b18 : Binding<*, F18>, b19 : Binding<*, F19>, b20 : Binding<*, F20>, b21 : Binding<*, F21>, b22 : Binding<*, F22>) : this(
        RecordData(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22)
    )

    fun copy(vararg changes: Binding<*, *>): Record22<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22> =
        Record22(data.copy(*changes))


}
fun <F1 : Field<*>> record(b1 : Binding<*, F1>): Record1<F1> =
    Record1(b1)
fun <F1 : Field<*>, F2 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>): Record2<F1, F2> =
    Record2(b1, b2)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>): Record3<F1, F2, F3> =
    Record3(b1, b2, b3)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>): Record4<F1, F2, F3, F4> =
    Record4(b1, b2, b3, b4)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>): Record5<F1, F2, F3, F4, F5> =
    Record5(b1, b2, b3, b4, b5)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>): Record6<F1, F2, F3, F4, F5, F6> =
    Record6(b1, b2, b3, b4, b5, b6)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>): Record7<F1, F2, F3, F4, F5, F6, F7> =
    Record7(b1, b2, b3, b4, b5, b6, b7)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>): Record8<F1, F2, F3, F4, F5, F6, F7, F8> =
    Record8(b1, b2, b3, b4, b5, b6, b7, b8)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>): Record9<F1, F2, F3, F4, F5, F6, F7, F8, F9> =
    Record9(b1, b2, b3, b4, b5, b6, b7, b8, b9)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>): Record10<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10> =
    Record10(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>): Record11<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11> =
    Record11(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>): Record12<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12> =
    Record12(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>): Record13<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13> =
    Record13(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>): Record14<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14> =
    Record14(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>): Record15<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15> =
    Record15(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>): Record16<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16> =
    Record16(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>): Record17<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17> =
    Record17(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>, F18 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>, b18 : Binding<*, F18>): Record18<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18> =
    Record18(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>, F18 : Field<*>, F19 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>, b18 : Binding<*, F18>, b19 : Binding<*, F19>): Record19<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19> =
    Record19(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>, F18 : Field<*>, F19 : Field<*>, F20 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>, b18 : Binding<*, F18>, b19 : Binding<*, F19>, b20 : Binding<*, F20>): Record20<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20> =
    Record20(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>, F18 : Field<*>, F19 : Field<*>, F20 : Field<*>, F21 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>, b18 : Binding<*, F18>, b19 : Binding<*, F19>, b20 : Binding<*, F20>, b21 : Binding<*, F21>): Record21<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21> =
    Record21(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21)
fun <F1 : Field<*>, F2 : Field<*>, F3 : Field<*>, F4 : Field<*>, F5 : Field<*>, F6 : Field<*>, F7 : Field<*>, F8 : Field<*>, F9 : Field<*>, F10 : Field<*>, F11 : Field<*>, F12 : Field<*>, F13 : Field<*>, F14 : Field<*>, F15 : Field<*>, F16 : Field<*>, F17 : Field<*>, F18 : Field<*>, F19 : Field<*>, F20 : Field<*>, F21 : Field<*>, F22 : Field<*>> record(b1 : Binding<*, F1>, b2 : Binding<*, F2>, b3 : Binding<*, F3>, b4 : Binding<*, F4>, b5 : Binding<*, F5>, b6 : Binding<*, F6>, b7 : Binding<*, F7>, b8 : Binding<*, F8>, b9 : Binding<*, F9>, b10 : Binding<*, F10>, b11 : Binding<*, F11>, b12 : Binding<*, F12>, b13 : Binding<*, F13>, b14 : Binding<*, F14>, b15 : Binding<*, F15>, b16 : Binding<*, F16>, b17 : Binding<*, F17>, b18 : Binding<*, F18>, b19 : Binding<*, F19>, b20 : Binding<*, F20>, b21 : Binding<*, F21>, b22 : Binding<*, F22>): Record22<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22> =
    Record22(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22)
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos1<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos2<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos3<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos4<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos5<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos6<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos7<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos8<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos9<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos10<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos11<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos12<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos13<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos14<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos15<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos16<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos17<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos18<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos19<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos20<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos21<F, *>.get(field: F): T = (this as Record).data[field] as T
@Suppress("UNCHECKED_CAST")
operator fun <T, F : Field<T>> Pos22<F, *>.get(field: F): T = (this as Record).data[field] as T
fun RecordData.toRecord(): Record = when (this.size) {
    0 -> Record0
    1 -> Record1<Field<*>>(this)
    2 -> Record2<Field<*>, Field<*>>(this)
    3 -> Record3<Field<*>, Field<*>, Field<*>>(this)
    4 -> Record4<Field<*>, Field<*>, Field<*>, Field<*>>(this)
    5 -> Record5<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    6 -> Record6<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    7 -> Record7<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    8 -> Record8<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    9 -> Record9<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    10 -> Record10<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    11 -> Record11<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    12 -> Record12<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    13 -> Record13<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    14 -> Record14<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    15 -> Record15<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    16 -> Record16<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    17 -> Record17<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    18 -> Record18<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    19 -> Record19<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    20 -> Record20<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    21 -> Record21<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    22 -> Record22<Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>, Field<*>>(this)
    else -> error("Too many fields ${this.size}")
}
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos1<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos2<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos3<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos4<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos5<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos6<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos7<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos8<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos9<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos10<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos11<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos12<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos13<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos14<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos15<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos16<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos17<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos18<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos19<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos20<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos21<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
@Suppress("UNCHECKED_CAST")
operator fun <F : Field<*>, Rest : Record> Pos22<F, Rest>.minus(field: F): Rest =
    ((this as Record).data - field).toRecord() as Rest
