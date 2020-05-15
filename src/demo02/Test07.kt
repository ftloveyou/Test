package demo02


fun main() {
    println(Test07.DEFAULT)
    println(Color.DEFAULT.value)
    println(Color.DEFAULT)
    Color.values().forEach { println(it) }
    println(Color.valueOf("DEFAULT"))
}

enum class Test07 {
    DEFAULT,RED,GREEN,WHITE
}

enum class Color(val value: Int){
    DEFAULT(0),
    RED(1),
    GREEN(2),
    WHITE(3)
}