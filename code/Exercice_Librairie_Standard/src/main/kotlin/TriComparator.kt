fun main() {
    var list = listOf(1234, 747, 77, 1977, -71, 17, 7)
    triComplexe(list)
}

fun triComplexe(liste: List<Int>): List<Int> {
    var nvListe = liste.sortedWith(compareBy({ cptSept(it) }, {it}))
    println(nvListe)
    return nvListe
}

fun cptSept(number : Int) : Int{
    return number.toString().count { it == '7'}
}