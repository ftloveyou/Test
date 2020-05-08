package demo02

fun main() {
    var str = "lite_web"
    when{
        str.contains("web") -> println("web")
        str.contains("app")||str.contains("native")-> println("app")
        else -> println("service")

    }
}