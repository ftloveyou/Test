package demo01

fun main() {
    var t = Test07()
    var t1 = Thread(t)
    var t2 = Thread(t)
    var t3 = Thread(t)
    t1.start()
    t2.start()
    t3.start()
}

class Test07 : Thread() {
    private var count = 100
    private var obj = Object()
    override fun run() {
        synchronized(obj) {
            for (i in 0..35) {
                if (count > 0) {
                    println("当前在售第${count}张票，${Thread.currentThread().name}")
                    count--
                }
            }

        }

    }

}



