package org.example

fun main() {
    compteChiffre(0, 5621375)
}

fun compteChiffre(chiffre: Int, nombre: Int) {
    if (chiffre < 0 || chiffre > 9) {
        throw IllegalArgumentException()
    }

    val nombreString = nombre.toString()
    val chiffreString = chiffre.toString()
    val count = nombreString.count({ it == chiffreString[0]})
    println(count)
}