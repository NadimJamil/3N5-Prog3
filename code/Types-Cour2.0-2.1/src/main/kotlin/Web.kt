import org.jsoup.Jsoup
import org.jsoup.select.Elements

fun main(){
    web()
}

fun web(){
    val lien = "https://centr.com/blog/show/7790/which-is-better-body-part-split-vs-full-body-workout"
    val doc = Jsoup.connect(lien).get()
//    val text = doc.body().text()
    val text = doc.outerHtml()
    doc.outputSettings().prettyPrint(true)
    println(text)
}