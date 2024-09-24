package org.example

fun main() {
    jourParMois(3)
    val listeDouble = doubleArrayOf(2.5, 1.0, 3.0)
    listetrie(listeDouble)
}

fun jourParMois(n: Int) {
    if(n >12){
        throw IllegalArgumentException()
    }
    val nvListe = mutableListOf<Int>()
    val joursDansMois = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    for(i in 0..n){
        nvListe.add(joursDansMois[i])
    }
    println(nvListe)

}

fun listetrie(list : DoubleArray){
    val liste = listOf(2.5, 1, 3)
    println(liste)
    val listeTrie = list.sorted()
    println(listeTrie)
}