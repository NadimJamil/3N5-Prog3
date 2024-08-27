fun main(args : Array<String>){
    val numRows = args[0].toInt()

    if (numRows > 0){
        for(i in 0 .. numRows){
            for(j in 1 .. i){
                print("*")
            }
            println()
        }
    }



}