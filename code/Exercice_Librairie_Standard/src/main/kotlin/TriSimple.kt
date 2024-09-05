fun main() {
    var listDouble = mutableListOf(1.5, 4.8, 3.2, 9.1)
    var listDouble2 = mutableListOf(0.1, 12.34, -0.1234, 3.1416)
    triInverseALaMain(listDouble)
    triInverse(listDouble)
    triInverseALaMain(listDouble2)
    triInverse(listDouble2)
}

fun triInverseALaMain(liste: List<Double>) {
    val listeMutable = liste.toMutableList()
    for (i in 0..listeMutable.size-1) {
        for (j in 0..listeMutable.size - i - 2) {
            if (listeMutable[j] < listeMutable[j + 1]) {
                val temp = listeMutable[j]
                listeMutable[j] = listeMutable[j+1]
                listeMutable[j+1] = temp
            }
        }
    }
    println(listeMutable)
}

fun triInverse(liste: List<Double>) {
    println(liste.sortedDescending())
}