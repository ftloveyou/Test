package demo01

data class Student (
    var id:Int,
    var nickname:String,
    var age:Int,
    var books:ArrayList<String>,
    var bookmap:HashMap<String,String>
)