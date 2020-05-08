package demo01

import java.util.concurrent.Executors

class Test03:Runnable{
    override fun run() {
        var sum = 0
        for (i in 1..100){
            sum += i
        }
        println(sum)
    }
}

fun main() {
    var test03 = Test03()
    var t = Thread(test03)


    var executors = Executors.newFixedThreadPool(2)
    executors.submit(t)
    executors.shutdown()


}