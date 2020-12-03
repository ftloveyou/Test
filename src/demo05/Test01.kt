package demo05

data class Node(
    var data: Int? = null,
    var next: Node? = null
)

fun main() {
    var header = Node(0)
    productLink(header)
    ergodicLink(header)
    header = insertHeader(-1, header)
    ergodicLink(header)
    insertTail(11, header)
    ergodicLink(header)
    header = deleteNode(11, header)
    ergodicLink(header)


}

//构造链表
fun productLink(header: Node){
    var cur = header
    for (i in 1..10){
        var node = Node(i)
        cur.next = node
        cur = cur.next!!
    }
}

//遍历链表
fun ergodicLink(header: Node){
    var cur = header
    while (true){
        if (cur.next != null){
            println(cur.data)
            cur = cur.next!!
        }else{
            println(cur.data)
            println("---------------------------")
            break
        }
    }
}

//头插法
fun insertHeader(data: Int, header: Node): Node{
    val node = Node(data)
    node.next = header
    return node
}

//尾插法
fun insertTail(data: Int, header: Node){
    val node = Node(data)
    var cur = header
    while (true){
       if (cur.next != null) {
           cur = cur.next!!
       }else{
           cur.next = node
           break
       }
    }
}

fun deleteNode(data: Int, header: Node): Node{
    var cur = header.next
    var pre = header
    if (pre.data == data){
        return pre.next!!
    }else{
        pre = cur!!
        cur = cur.next!!
        while (true){
            if (cur!!.data != data){
                pre = cur!!
                cur = cur.next
            }
            else{
                pre.next = cur.next
                return header
            }
        }
    }

}

