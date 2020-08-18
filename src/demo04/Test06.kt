package demo04


fun main() {
    //位操作符
    val a = 2
    val b = 1
    println(a.and(b))//按位与
    println(a.or(b))//按位或
    println(a.inv())//按位非
    println(a.xor(b))//按位异或
    println(b.shl(1))//左移
    println(a.shr(1))//右移
    println(a.ushr(1))//无符号右移

    println("-----------")
    //位运算符
    println(a and b)//按位与
    println(a or b)//按位或
    println(a.inv())//按位非
    println(a xor b)//按位异或
    println(b shl 1)//左移
    println(a shr 1)//右移
    println(a ushr 1)//无符号右移

}