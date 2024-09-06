fun main() {
    var list = listOf(1234, 747, 77, 1977, -71, 17, 7)
    triComplexe(list)
}

fun triComplexe(liste: List<Int>): List<Int> {
    var nvListe = mutableListOf<Int>()
    var nbSept = liste.count({it == 7})
    var test = liste.sortedWith(compareBy({it == 7}, {it}))
    for(i in 0..liste.size -1){
        for(j in 0..liste.size - i - 2){
            if(liste[j] - liste[j + 1] > 7){
                nvListe.add(liste[j])
            }
        }
    }
    println(nvListe)
    return  liste
}