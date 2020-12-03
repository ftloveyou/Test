package demo05



class SSS constructor(id: Long?,name: String?){
    var id: Long? = null
    var name: String? = null
    var age: Int? = null
    init {
        this.id = id
        this.name = name
    }

    constructor(id: Long?, name: String?, age: Int?): this(id = id,name = name){
        this.age = age
    }
}

fun main() {
    var sss = SSS(1, "bbx")
    var ss1 = SSS(2, "ff", 1)
    println(ss1.name)
    println(ss1.id)
    println(ss1.age)
}