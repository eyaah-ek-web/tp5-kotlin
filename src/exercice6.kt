class Library(val libraryName: String) {
    class Book(
        val title: String,
        val author: String
    ) {
        fun printDetails(library: Library) {
            println("Bibliothèque : ${library.libraryName}")
            println("Titre : $title")
            println("Auteur : $author")
        }
    }
}

fun main() {
    val library = Library("Bibliothèque Centrale")
    val book = Library.Book("Le Petit Prince", "Antoine de Saint-Exupéry")

    book.printDetails(library)
}
