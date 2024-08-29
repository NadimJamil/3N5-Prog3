fun main() {
    var str = "bonjour"
    if (str.length < 0) {
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