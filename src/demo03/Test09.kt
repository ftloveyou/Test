package demo03

import java.math.BigDecimal
import java.util.regex.Pattern

fun main() {
    var dd: BigDecimal? = BigDecimal(1000001111)
    println(checkAmount(dd))

}

fun checkAmount(amount: BigDecimal?): Boolean{
    return amount != null && (!checkOutputAmount(amount!!.toString()) || amount!! > BigDecimal(10000000))
}

fun checkOutputAmount(str: String?): Boolean {
    if (null == str || "" == str) {
        return false
    }
    val pattern = Pattern.compile("^(0\\.[0-9]{1,6}|[1-9]\\d*(\\.\\d{1,6})?)\$")
    return pattern.matcher(str).matches()
}