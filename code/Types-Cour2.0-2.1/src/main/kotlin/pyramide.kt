fun main(args : Array<String>){
    if(args.isEmpty()){
        print("argument vide")
    }
    else{
        for(arg : String in args){
            val hauteur: Int = arg.toInt()
            pyramid(hauteur)
        }
    }
}

fun pyramid(hauteur : Int){
    var nbEtoile: Int = 1
    var str: String = ""
    var nbEspace:Int = hauteur - 1
    for(i in 0 .. hauteur){
        for(b in 1 .. i){
            try {
                str = " ".repeat(nbEspace) + "*".repeat(nbEtoile)
                println(str)
                nbEtoile += 2
                nbEspace -= 1
            } catch (e: Exception) {

            }
        }
     }
}