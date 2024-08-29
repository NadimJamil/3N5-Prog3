import kotlin.random.Random

fun main(){
creeTableauAleatoire(5)
}

fun creeTableauAleatoire(n: Int): Array<Int> {
    val randomValues = List(n) { Random.nextInt(0, 100) }
    println(randomValues)

    var array = arrayOf(n)
    return array
}



//fun moyenne() : Double{
//    var sum: Double = 0.0
//    var count: Int = 0
//    for (element in )
//}

