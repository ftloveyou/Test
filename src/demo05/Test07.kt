package demo05


fun main() {
   var list = listOf<Int>(1,2,0,4,3)
    list.forEach {
        try {
            println(1/it)
        }catch (e: Exception){
            println(e.message)
            throw e
        }

    }
}


open class c1(var v1: Long? = null,var v2: Long? = null)

class c2():c1(){
    constructor(v1: Long?,v2: Long?):this(

    ){
      this.v1 = v1
        this.v2 = v2
    }


}