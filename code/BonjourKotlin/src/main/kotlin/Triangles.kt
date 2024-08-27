fun main(){

    for(i in 1 .. 2){
        print(triangle(4))
    }
}

fun triangle(hauteur : Int) : String {
    val str = StringBuilder()
    for(i in 1 .. hauteur){
        for(y in 1 .. i){
            str.append("*")
        }
        str.append("\n")
    }
    return str.toString()
}