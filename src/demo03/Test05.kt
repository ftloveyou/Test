package demo03

data class Node<T>(
    var data: T? = null,
    var left: Node<T>? = null,
    var right: Node<T>? = null
)

fun main() {
    var list = mutableListOf<Int>(5,2,3,4,1,6,7,8)
    var rootNode = Node<Int>(list[0],null,null)
    for (l in 1 until list.size){
        addNode(rootNode,list[l])
    }
    println(rootNode)
}

fun addNode(nodeFlag:Node<Int>,t: Int) {
    if (nodeFlag.data!! > t) {
        if (nodeFlag.left != null){
            addNode(nodeFlag.left!!,t)
        }else{
            var node:Node<Int> = Node(t,null,null)
            nodeFlag.left = node
        }
    }else if (nodeFlag.right != null){
          addNode(nodeFlag.right!!,t)
    }  else {
        var node:Node<Int> = Node(t,null,null)
        nodeFlag.right = node
    }

}