package org.example

import org.jsoup.Jsoup

fun main(){
Jsoup()
}

fun Jsoup(){
    val lien = "https://info.cegepmontpetit.ca/3N5-Prog3/tp/tp2"
    val doc = Jsoup.connect(lien).get()
    val imgs = doc.select("img")
    for(img in imgs){
        val src = img.attr("src")
        println(src)
    }
    println(imgs)
    println(lien)
}