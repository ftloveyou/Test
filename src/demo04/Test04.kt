package demo04

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.FutureTask

class Test04: Callable<String>{
    private var threadlocal = ThreadLocal<String>()
    override fun call(): String {
        threadlocal.set(Thread.currentThread().name)
        return threadlocal.get()
    }
}

fun main1() {
    var test = Test04()
    var pool = Executors.newFixedThreadPool(2)
    var future = pool.submit(test)
    println(future.get())
    pool.shutdown()
}

fun main() {
    var test1 = Test04()
    var test2 = Test04()
    var task1: FutureTask<String> = FutureTask<String>(test1)
    var task2: FutureTask<String> = FutureTask<String>(test2)
    var list = mutableListOf<FutureTask<String>>(task1,task2)
    var pool = Executors.newFixedThreadPool(2)
    pool.execute(task1)
    pool.execute(task2)
    list.forEach {
        println(it.get())
    }
    pool.shutdown()
}