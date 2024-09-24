package org.example

import java.io.File

fun main(args : Array<String>){
    lire()
    ecrire(args)
}

fun lire(){
    val lien = "message.txt"
    val fichier = File(lien)
    if(fichier.exists()){
        fichier.readText()
    }
}

fun ecrire(args : Array<String>){
    if(args.size != 2){
        println("Il faut 2 arguments")
    }
    else{
        val arg1 = args[0]
        val arg2 = args[1]
        val fichier1 = File(arg1)
        val fichier2 = File(arg2)
        val text = fichier2.readText()
        fichier1.writeText(text)
    }
}