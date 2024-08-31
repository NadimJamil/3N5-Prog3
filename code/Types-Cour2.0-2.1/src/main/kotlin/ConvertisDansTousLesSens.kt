fun main() {
    intToFloat(5)
    doubleToInt(4.0)
    stringToInt("6")
    intToString(5)
    floatToDouble(5F)
}

fun intToFloat(i: Int) {
    var fl = i.toFloat()
    println("intToFloat")
    println("Int : $i")
    println("Float : $fl")
    println()
}

fun doubleToInt(d: Double) {
    var i = d.toInt()
    println("doubleToInt")
    println("Double : $d")
    println("Int : $i")
    println()
}

fun stringToInt(s : String){
    var i = s.toInt()
    println("stringToInt")
    println("String : $s")
    println("Int : $i")
    println()
}

fun intToString(i : Int){
    var s = i.toString()
    println("intToString")
    println("Int : $i")
    println("String : $s")
    println()
}

fun floatToDouble(fl : Float){
    var d = fl.toDouble()
    println("floatToDouble")
    println("Float : $fl")
    println("Double : $d")
    println()
}
//convertit un Int en Float
//convertit un Double en Int (qu'est-ce qui se passe après la virgule?)
//convertit une String en Int (qu'est-ce qui se passe s'il y a autre chose que des chiffres?) --> une erreur
//convertit un Int en String
//convertit un Float en Double