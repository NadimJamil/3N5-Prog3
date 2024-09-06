fun main() {
    var list = listOf(1, 4, 5, 6, 2, 1, 6, 3, 6, 7, 8, 6)
    println(list)
    trouveALaMain(1, list)
    compteALaMain(6, list)
    println()
    trouveALaMain(55, list)
    compteALaMain(12, list)
    println()
    trouve(1, list)
    compte(6, list)
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

fun trouve(element: Int, liste: List<Int>): Boolean {
    var chiffreDansLaListe = liste.contains(element)
    try {
        if (chiffreDansLaListe) {
            println("Le chiffre $element est bien dans la liste")
            return true
        }
    } catch (e: Exception) {
        println("Le chiffre $element n'est pas dans la liste")
    }
    return false
}

fun compteALaMain(element: Int, liste: List<Int>): Int {
    var cpt = 0
    for (i in 0..liste.size - 1) {
        try {
            if (element == liste[i]) {
                cpt++
            }
        } catch (e: Exception) {
            println("Le chiffre $element n'est pas dans la liste")
        }
    }
    println("Il y a $cpt fois le chiffre $element dans la liste")
    return cpt
}

fun compte(element: Int, liste: List<Int>): Int{
    var chiffreCompte = liste.count({it == element})
    println("Il y a $chiffreCompte fois le chiffre $element dans la liste")
    return chiffreCompte
}