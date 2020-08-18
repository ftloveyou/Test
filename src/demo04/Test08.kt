package demo04


fun main() {

    println(Student.a)
    println(Test08.ee)
    println(Test08.ss)

}

object Student{
    const val a = 111

}

class Test08 {
    companion object {
        const val ss = 1111
        const val ee = 22222;
    }
}
