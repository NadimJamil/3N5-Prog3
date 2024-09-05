fun main(){
    fonctionReadln()
}

fun fonctionReadln(){
    val txt = "Veuillez entrer un nombre : "
    val txt2 = "Ceci n'est pas un nombre, veuillez entrer un nombre : "
    while(true){
        println(txt)
        var rep : String = readln()
        val nombre = rep.toIntOrNull()
        if(nombre != null){
            println("Merci, votre nombre est $rep .")
            return
        }
        else{
            println(txt2)
        }
    }
}