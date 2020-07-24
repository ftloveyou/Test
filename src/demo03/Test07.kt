package demo03

import java.util.concurrent.ThreadLocalRandom

fun main() {



      println(getCorrectPassword())



}

fun randomPassword(): String {
    val str = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    //由Random生成随机数
    val sb = StringBuilder()
    //长度为几就循环几次
    for (i in 0 until 8) {
        //产生0-61的数字
        val number = ThreadLocalRandom.current().nextInt(62)
        //将产生的数字通过length次承载到sb中
        sb.append(str[number])
    }
    //将承载的字符转换成字符串
    return sb.toString()
}

fun getCorrectPassword(): String{
    val reg = Regex("^(?=.*[0-9].*)(?=.*[A-Z].*)(?=.*[a-z].*).{8}$")
    while (true){
        val password = randomPassword()
        if (password.matches(reg)) {
            return password
        }
    }
}