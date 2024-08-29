fun main(){
    val a = 1                                   // type est Int
    val aa = 1L                                 // type est Long
    val aaa = a * 25 + aa * 100                 // type est String --> Long
    val b = 1.0                                 // type est Double
    val c = "1"                                 // type est Char --> String
    val d = true                                // type est Bool
    val laChose = c + b                         // type est String
    val k = listOf("1", "2", "3")               // type est Char[] --> List<String>
    val l = mutableListOf(true, false, true)    // type est Bool[] --> mutableList
}