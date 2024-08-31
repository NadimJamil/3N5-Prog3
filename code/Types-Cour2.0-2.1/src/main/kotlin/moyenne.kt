import kotlin.random.Random

fun main(){
    var liste = creeTableauAleatoire((6))
    somme( liste)
    moyenne(liste)
    min(liste)
    max(liste)
}

fun creeTableauAleatoire(n: Int): Array<Int> {
    val randomValues = List(n) { Random.nextInt(0, 100) }
    println(randomValues)

    var array = randomValues.toTypedArray()
    return array
}

fun somme(list : Array<Int>) : Int{
    var sumList = list.sum()
    println(sumList)
    return sumList
}

fun moyenne(list : Array<Int>) : Double{
    var avgList = list.average()
    println(avgList)
    return avgList
}

fun min(list : Array<Int>) : Int{
    var minList = list.min()
    println(minList)
    return minList
}

fun max(list : Array<Int>) : Int{
    var maxList = list.max()
    println(maxList)
    return maxList
}

