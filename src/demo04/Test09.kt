package demo04

import java.util.concurrent.Callable
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.FutureTask

fun main() {
    println("线程开始")
    var list1 = mutableListOf<ThreadResult>()
    val executors = Executors.newFixedThreadPool(6)
    val list = mutableListOf<FutureTask<ThreadResult>>()
    var countDownLatch = CountDownLatch(6)
    for (i in 0..5){
        val threadTest = ThreadTest()
        val task = FutureTask<ThreadResult>(threadTest)
        executors.submit(task)
        list.add(task)
        println(countDownLatch.count)
        countDownLatch.countDown()
    }
    list.forEach {
        println(it.get())
        list1.add(it.get())
    }
    countDownLatch.await()
    executors.shutdown()
    list1.forEach {
        println(it.module)
    }
    println("线程结束")


}

class ThreadTest: Callable<ThreadResult>{
    override fun call(): ThreadResult {
        return ThreadResult(
            Thread.currentThread().name,
            1
        )
    }
}

data class ThreadResult(
    var module: String? = null,
    var status: Int? = null
)

