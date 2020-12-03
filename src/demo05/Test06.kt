package demo05

fun main() {

    for(i in 1..50){
        var ext = "ext$i"
        println("self.$ext = $ext ")
        if ( i%10 == 0) println()

    }
}
