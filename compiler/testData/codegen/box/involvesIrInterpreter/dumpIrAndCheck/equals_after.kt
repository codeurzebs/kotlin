// !LANGUAGE: +IntrinsicConstEvaluation
// TARGET_BACKEND: JVM_IR

const val trueVal = <!EVALUATED("true")!>true<!>
const val falseVal = <!EVALUATED("false")!>false<!>

const val charOneVal = <!EVALUATED("1")!>'1'<!>
const val charTwoVal = <!EVALUATED("2")!>'2'<!>
const val charThreeVal = <!EVALUATED("3")!>'3'<!>
const val charFourVal = <!EVALUATED("4")!>'4'<!>

const val byteMinusOneVal = (-1).<!EVALUATED("-1")!>toByte()<!>
const val byteOneVal = 1.<!EVALUATED("1")!>toByte()<!>
const val byteTwoVal = 2.<!EVALUATED("2")!>toByte()<!>
const val byteThreeVal = 3.<!EVALUATED("3")!>toByte()<!>
const val byteFourVal = 4.<!EVALUATED("4")!>toByte()<!>

const val shortMinusOneVal = (-1).<!EVALUATED("-1")!>toShort()<!>
const val shortOneVal = 1.<!EVALUATED("1")!>toShort()<!>
const val shortTwoVal = 2.<!EVALUATED("2")!>toShort()<!>
const val shortThreeVal = 3.<!EVALUATED("3")!>toShort()<!>
const val shortFourVal = 4.<!EVALUATED("4")!>toShort()<!>

const val intMinusOneVal = <!EVALUATED("-1")!>-1<!>
const val intOneVal = <!EVALUATED("1")!>1<!>
const val intTwoVal = <!EVALUATED("2")!>2<!>
const val intThreeVal = <!EVALUATED("3")!>3<!>
const val intFourVal = <!EVALUATED("4")!>4<!>

const val longMinusOneVal = <!EVALUATED("-1")!>-1L<!>
const val longOneVal = <!EVALUATED("1")!>1L<!>
const val longTwoVal = <!EVALUATED("2")!>2L<!>
const val longThreeVal = <!EVALUATED("3")!>3L<!>
const val longFourVal = <!EVALUATED("4")!>4L<!>

const val floatMinusOneVal = <!EVALUATED("-1.0")!>-1.0f<!>
const val floatOneVal = <!EVALUATED("1.0")!>1.0f<!>
const val floatTwoVal = <!EVALUATED("2.0")!>2.0f<!>
const val floatThreeVal = <!EVALUATED("3.0")!>3.0f<!>
const val floatFourVal = <!EVALUATED("4.0")!>4.0f<!>

const val doubleMinusOneVal = <!EVALUATED("-1.0")!>-1.0<!>
const val doubleOneVal = <!EVALUATED("1.0")!>1.0<!>
const val doubleTwoVal = <!EVALUATED("2.0")!>2.0<!>
const val doubleThreeVal = <!EVALUATED("3.0")!>3.0<!>
const val doubleFourVal = <!EVALUATED("4.0")!>4.0<!>

const val someStr = <!EVALUATED("123")!>"123"<!>
const val otherStr = <!EVALUATED("other")!>"other"<!>

const val equalsBoolean1 = trueVal.<!EVALUATED("true")!>equals(trueVal)<!>
const val equalsBoolean2 = <!EVALUATED("false")!>trueVal == falseVal<!>
const val equalsBoolean3 = falseVal.<!EVALUATED("false")!>equals(1)<!>

const val equalsChar1 = charOneVal.<!EVALUATED("false")!>equals(charTwoVal)<!>
const val equalsChar2 = charTwoVal.<!EVALUATED("true")!>equals(charTwoVal)<!>
const val equalsChar3 = <!EVALUATED("false")!>charThreeVal == charTwoVal<!>
const val equalsChar4 = charFourVal.<!EVALUATED("false")!>equals(1)<!>

const val equalsByte1 = byteOneVal.<!EVALUATED("false")!>equals(byteTwoVal)<!>
const val equalsByte2 = byteTwoVal.<!EVALUATED("true")!>equals(byteTwoVal)<!>
const val equalsByte3 = <!EVALUATED("false")!>byteThreeVal == byteTwoVal<!>
const val equalsByte4 = byteFourVal.<!EVALUATED("false")!>equals(1)<!>

const val equalsShort1 = shortOneVal.<!EVALUATED("false")!>equals(shortTwoVal)<!>
const val equalsShort2 = shortTwoVal.<!EVALUATED("true")!>equals(shortTwoVal)<!>
const val equalsShort3 = <!EVALUATED("false")!>shortThreeVal == shortTwoVal<!>
const val equalsShort4 = shortFourVal.<!EVALUATED("false")!>equals(1)<!>

const val equalsInt1 = intOneVal.<!EVALUATED("false")!>equals(intTwoVal)<!>
const val equalsInt2 = intTwoVal.<!EVALUATED("true")!>equals(intTwoVal)<!>
const val equalsInt3 = <!EVALUATED("false")!>intThreeVal == intTwoVal<!>
const val equalsInt4 = intFourVal.<!EVALUATED("false")!>equals(1)<!>

const val equalsLong1 = longOneVal.<!EVALUATED("false")!>equals(longTwoVal)<!>
const val equalsLong2 = longTwoVal.<!EVALUATED("true")!>equals(longTwoVal)<!>
const val equalsLong3 = <!EVALUATED("false")!>longThreeVal == longTwoVal<!>
const val equalsLong4 = longFourVal.<!EVALUATED("false")!>equals(1)<!>

const val equalsFloat1 = floatOneVal.<!EVALUATED("false")!>equals(floatTwoVal)<!>
const val equalsFloat2 = floatTwoVal.<!EVALUATED("true")!>equals(floatTwoVal)<!>
const val equalsFloat3 = <!EVALUATED("false")!>floatThreeVal == floatTwoVal<!>
const val equalsFloat4 = floatFourVal.<!EVALUATED("false")!>equals(1)<!>

const val equalsDouble1 = doubleOneVal.<!EVALUATED("false")!>equals(doubleTwoVal)<!>
const val equalsDouble2 = doubleTwoVal.<!EVALUATED("true")!>equals(doubleTwoVal)<!>
const val equalsDouble3 = <!EVALUATED("false")!>doubleThreeVal == doubleTwoVal<!>
const val equalsDouble4 = doubleFourVal.<!EVALUATED("false")!>equals(1)<!>

const val equalsString1 = someStr.<!EVALUATED("false")!>equals(otherStr)<!>
const val equalsString2 = someStr.<!EVALUATED("true")!>equals("123")<!>
const val equalsString3 = <!EVALUATED("false")!>otherStr == someStr<!>
const val equalsString4 = someStr.<!EVALUATED("false")!>equals(1)<!>

fun box(): String {
    if (<!EVALUATED("false")!>equalsBoolean1 != true<!>)    return "Fail 1.1"
    if (<!EVALUATED("false")!>equalsBoolean2 != false<!>)   return "Fail 1.2"
    if (<!EVALUATED("false")!>equalsBoolean3 != false<!>)   return "Fail 1.3"

    if (<!EVALUATED("false")!>equalsChar1 != false<!>)   return "Fail 2.1"
    if (<!EVALUATED("false")!>equalsChar2 != true<!>)    return "Fail 2.2"
    if (<!EVALUATED("false")!>equalsChar3 != false<!>)   return "Fail 2.3"
    if (<!EVALUATED("false")!>equalsChar4 != false<!>)   return "Fail 2.3"

    if (<!EVALUATED("false")!>equalsByte1 != false<!>)   return "Fail 3.1"
    if (<!EVALUATED("false")!>equalsByte2 != true<!>)    return "Fail 3.2"
    if (<!EVALUATED("false")!>equalsByte3 != false<!>)   return "Fail 3.3"
    if (<!EVALUATED("false")!>equalsByte4 != false<!>)   return "Fail 3.3"

    if (<!EVALUATED("false")!>equalsShort1 != false<!>)   return "Fail 4.1"
    if (<!EVALUATED("false")!>equalsShort2 != true<!>)    return "Fail 4.2"
    if (<!EVALUATED("false")!>equalsShort3 != false<!>)   return "Fail 4.3"
    if (<!EVALUATED("false")!>equalsShort4 != false<!>)   return "Fail 4.3"

    if (<!EVALUATED("false")!>equalsInt1 != false<!>)   return "Fail 5.1"
    if (<!EVALUATED("false")!>equalsInt2 != true<!>)    return "Fail 5.2"
    if (<!EVALUATED("false")!>equalsInt3 != false<!>)   return "Fail 5.3"
    if (<!EVALUATED("false")!>equalsInt4 != false<!>)   return "Fail 5.3"

    if (<!EVALUATED("false")!>equalsLong1 != false<!>)   return "Fail 6.1"
    if (<!EVALUATED("false")!>equalsLong2 != true<!>)    return "Fail 6.2"
    if (<!EVALUATED("false")!>equalsLong3 != false<!>)   return "Fail 6.3"
    if (<!EVALUATED("false")!>equalsLong4 != false<!>)   return "Fail 6.3"

    if (<!EVALUATED("false")!>equalsFloat1 != false<!>)   return "Fail 7.1"
    if (<!EVALUATED("false")!>equalsFloat2 != true<!>)    return "Fail 7.2"
    if (<!EVALUATED("false")!>equalsFloat3 != false<!>)   return "Fail 7.3"
    if (<!EVALUATED("false")!>equalsFloat4 != false<!>)   return "Fail 7.3"

    if (<!EVALUATED("false")!>equalsDouble1 != false<!>)   return "Fail 8.1"
    if (<!EVALUATED("false")!>equalsDouble2 != true<!>)    return "Fail 8.2"
    if (<!EVALUATED("false")!>equalsDouble3 != false<!>)   return "Fail 8.3"
    if (<!EVALUATED("false")!>equalsDouble4 != false<!>)   return "Fail 8.3"

    if (<!EVALUATED("false")!>equalsString1 != false<!>)   return "Fail 9.1"
    if (<!EVALUATED("false")!>equalsString2 != true<!>)    return "Fail 9.2"
    if (<!EVALUATED("false")!>equalsString3 != false<!>)   return "Fail 9.3"
    if (<!EVALUATED("false")!>equalsString4 != false<!>)   return "Fail 9.3"

    return "OK"
}
