package demo01

import com.google.gson.Gson

fun main() {
    var gson = Gson()
    var books = arrayListOf<String>("操作系统","数据结构")
    var bookmap = hashMapOf<String,String>("1" to "操作系统","2" to "数据结构")
    var s1 = Student(1, "冯通", 24, books, bookmap)
    var result = gson.toJson(s1)
    println(result)
    var s2 = gson.fromJson(result, Student::class.java)
    println(s2.age)
    println(s2.bookmap)
    println(s2.books)

    for(i in 1..3){
        println(i)
    }


}