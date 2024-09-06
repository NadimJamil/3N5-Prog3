fun main() {
    var list = listOf(1, 4, 5, 6)
    println(list)
    trouveALaMain(55, list)
}

fun trouveALaMain(element: Int, liste: List<Int>): Boolean {

    for (i in 0..liste.size) {
        try {
            if (element == liste[i]) {
                var nombre = liste[i]
                println("Le chiffre $nombre est bien dans la liste")
                return true
            }
        } catch (e: Exception) {
            println("Le chiffre $element n'est pas dans la liste")
            return false
        }
    }
    return true
}

//fun trouve(element: Int, liste: List<Int>): Boolean{
//
//}
//
//fun compteALaMain(element: Int, liste: List<Int>): Int {
//
//    return 0
//}

//fun compte(element: Int, liste: List<Int>): Int{
//
//}