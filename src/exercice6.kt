class Library(val libraryName: String) {
    inner class Book(val title: String, val author: String) {
        fun printDetails() {
            println("Bibliothèque : $libraryName")
            println("Titre : $title")
            println("Auteur : $author")
        }
    }
}
fun main() {
    val library = Library("Anour")
    val book = Library.Book("La boite a merveille", "Ahmad safrioui")
    book.printDetails()
}
