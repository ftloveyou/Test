package demo02

object Demo{
    fun say(){
        println("dddddd")
    }
}

fun main() {
    Demo.say()

    var sql:StringBuilder = StringBuilder("select r.org_id,r.role_id,ra.auth_id from lakers.org_role r left join lakers.role_auth ra on r.role_id = ra.role_id")
        .append(" where r.org_id >= ").append(0).append(" and r.org_id <= ").append(15)
    println(sql)
}