fun main(){
    var list = listOf("on", "me", "voit", "on", "me", "voit", "plus", "on", "me", "voit", "plus", "on", "me", "voit")
    println(list)

//    var set = setOf("on", "me", "voit", "on", "me", "voit", "plus", "on", "me", "voit", "plus", "on", "me", "voit")
//    val sorted = set.sorted()

    val test = list.toMutableSet()

    val setSorted = test.sorted()

    setSorted.forEach {println(it)}
}