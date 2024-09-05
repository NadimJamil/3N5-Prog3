import java.io.File
import kotlin.contracts.contract

fun main(args : Array<String>){

    val fileName = args[0]
    val fichier = File(fileName)
    if(fichier.exists()){
        try {
            var texte = fichier.readText()
            println(texte)

//            var listeSplite = texte.split(" ")
//            println(listeSplite)
//
//            var texte2 = listeSplite.joinToString("-------")
//            println(texte2)
//
//            var texte3 = listeSplite.joinToString("\n-\n")
//            println(texte3)
//
//            var fichier2 = File(fileName)
//            fichier2.writeText(texte3)
        } catch (e: Exception) {
            println("Le fichier $fichier n'existe pas")        }
    }
    else{
        println("Le fichier n'existe pas")
    }
}