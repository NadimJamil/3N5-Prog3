import java.io.File

fun main(){
    val currentDir = File(".")
    val nomFIchier = "vide.txt"
    val monFIchierVide = File(currentDir, nomFIchier)
    monFIchierVide.createNewFile()
    println("Le fichier $monFIchierVide a été créé")

    val parentDir = currentDir.parentFile
    val nomfichier2 = "Nom_Complet.txt"
    val monFichierAvecNom = File(parentDir, nomfichier2)
    val contenu = "Nadim Jamil"
    monFichierAvecNom.writeText(contenu)
    println("Le fichier $nomfichier2 a été créé")
}
