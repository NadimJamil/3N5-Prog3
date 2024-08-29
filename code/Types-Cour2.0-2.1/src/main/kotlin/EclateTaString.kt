fun main(args : Array<String>) {
    var str = args[0]
    if (args.isEmpty()) {
        print("string vide")
    }
    else
    {
        for (i in 0..str.length) {
            try {
                print(str[i])
                println()
            } catch (e: Exception) {

            }
        }
    }


}