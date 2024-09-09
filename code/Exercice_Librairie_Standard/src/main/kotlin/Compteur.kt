fun main(){

    var map = listOf("on", "me", "voit", "on", "me", "voit", "plus", "on", "me", "voit", "plus", "on", "me", "voit")
    println(map)

    val words = map.groupingBy { it }.eachCount()

    println(words)

//    méthode #2
//    var cpt = mutableMapOf<String, Int>()
//    for(i in map){
//        cpt[i] = cpt.getOrDefault(i, 0) + 1
//    }
//
//    println(cpt)


}