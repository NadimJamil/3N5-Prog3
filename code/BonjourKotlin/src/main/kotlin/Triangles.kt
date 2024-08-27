fun main(){

        print(triangle(4))
        print(triangle(8))
        print(triangle(10))
        print(triangle(100))
        print(triangle(3))
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