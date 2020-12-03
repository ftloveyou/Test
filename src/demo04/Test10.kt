package demo04

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.FutureTask

fun main() {
    var t1 = Sop()
    var t2 = Weight()
    var t3 = Def()
    val executors = Executors.newFixedThreadPool(6)
    var list = mutableListOf<FutureTask<ThreadResult>>(
        FutureTask<ThreadResult>(t1),
        FutureTask<ThreadResult>(t2),
        FutureTask<ThreadResult>(t3)
    )


    list.forEach {
        executors.submit(it)
    }

    list.forEach {
        println(it.get())
    }

    executors.shutdown()

}



class Sop: Callable<ThreadResult>{
    override fun call(): ThreadResult {
        return ThreadResult("sop",1)
    }

}

class Weight: Callable<ThreadResult>{
    override fun call(): ThreadResult {
        return ThreadResult("weight",1)
    }

}

class Def: Callable<ThreadResult>{
    override fun call(): ThreadResult {
        return ThreadResult("def",1)
    }

}


