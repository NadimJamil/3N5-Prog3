import kotlin.random.Random

fun main(){
creeTableauAleatoire(3)
}

fun creeTableauAleatoire(n: Int): Array<Int> {
    val randomValues = List(n) { Random.nextInt(0, 100) }
    println(randomValues)

    val nextValues = List(n) { Random.nextInt(0, 100) }
    println(nextValues)
    println("randomValues != nextValues is ${randomValues != nextValues}")
    return randomValues
}