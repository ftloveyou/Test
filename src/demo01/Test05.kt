fun main() {
    var map = mutableMapOf<Int,String>()
    map.put(1,"1")
    map.put(2,"2")
    for ((key,value) in map){
        println("${key}+${value}")
    }
    var map1 = mapOf<Int,String>()

    var str = "1"
    println(str::class)//kotlin 类
    println(str::class.java)//java 类
    println(str.javaClass)//java 类

    var person = Person("1",9)
    println(person.age)
    var person1 = Person()
    println(Person::class)
    println(Person::class.java)
    println(Person::javaClass)

    println(person::class)
    println(person::class.java)
    println(person.javaClass)






}



 class Person{
     var name: String?= null
     var age:Int = 0
     set(value) {
         if (value>10){
             field = value
         }else {
             field = 10
         }
     }
     constructor(name:String, age:Int){
         this.name = name
         this.age = age
     }
     constructor(){

     }
 }

