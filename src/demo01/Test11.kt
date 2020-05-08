package demo01

import java.util.concurrent.ThreadLocalRandom

data class Stu(
    var name:String?,
    var age: Int?
)

data class Sync(
    var name: String,
    var age: Int
)

fun main() {
    var s1 = Stu("1", 19)
    var s2 = Stu("2", 20)
    var list = mutableListOf<Stu>()
    var list1 = list.map {
        Sync(
            name = it.name!!,
            age = it.age!!
        )
    }
    list1.forEach { println(it.toString()) }

    println(randomPassword())






}

fun randomPassword(): String {
    val str = "1234567890"
    //由Random生成随机数
    val sb = StringBuilder()
    //长度为几就循环几次
    for (i in 0 until 6) {
        //产生0-61的数字
        val number = ThreadLocalRandom.current().nextInt(10)
        //将产生的数字通过length次承载到sb中
        sb.append(str[number])
    }
    //将承载的字符转换成字符串
    return sb.toString()
}