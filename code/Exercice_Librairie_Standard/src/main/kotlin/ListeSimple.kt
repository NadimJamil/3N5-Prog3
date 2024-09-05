fun main() {
    repete(4, 2)
    println(repeatChatGPT(4, 2))
}

fun repete(n: Int, nombreFois: Int) {
    var liste = mutableListOf<Int>()
    for (i in 1..n) {
        for (j in 1..nombreFois) {
            liste.add(i)
        }
    }
    println(liste)
}

fun repeatChatGPT(n: Int, nbFois: Int): List<Int> {
    val resultat = mutableListOf<Int>()
    for (i in 1..n) {
        repeat(nbFois) {
            resultat.add(i)
        }
    }
    return resultat
}