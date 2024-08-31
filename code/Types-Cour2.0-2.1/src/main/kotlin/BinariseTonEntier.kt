fun main() {
    binaireEnEntier()
}

fun binaireEnEntier() {
    var string = "687432"
    println("String :" + string)
    var nombre = string.toInt()
    println("Int :" + nombre)
    var binaire = nombre.toString(radix = 2)
        println("Binaire :" + binaire)

}