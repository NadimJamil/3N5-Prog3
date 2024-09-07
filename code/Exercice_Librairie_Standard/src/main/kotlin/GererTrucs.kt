fun main() {
    var a : Truc = Truc(4, "Poop")
    var b : Truc = Truc(7, "BKDS")
    var c : Truc = Truc(12, "YTG")
    val liste1 = mutableListOf(a, b, c)
    val liste2 = listOf(b, c, a)
    println("Liste 1 : $liste1")
    println("Liste 2 : $liste2")

    val aModifier = Truc(23, "PISS")

    val nouvelleListe1 = listOf(aModifier, b, c)
    val nouvelleListe2 = listOf(b, c, aModifier)

    println("Nouvelle Liste 1 : $nouvelleListe1")
    println("Nouvelle Liste 2 : $nouvelleListe2")
}
