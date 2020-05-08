package demo01

fun main(){

    var randomcode = ""
    // 用字符数组的方式随机
    var model = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var  m = model.toCharArray();
    for (i in 1..6) {
        var c = m[ (Math.random() * 62).toInt()]
        randomcode += c;
    }
    println(randomcode);

}
