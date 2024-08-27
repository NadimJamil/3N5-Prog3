import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements


fun main(){
    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()
    println(doc.title())

    val newsHeadlines: Elements = doc.select("#mp-itn b a")
    for (headline in newsHeadlines) {
        println("%s\n\t%s".format(
            headline.attr("title"),
            headline.absUrl("href")
        ))
    }
}