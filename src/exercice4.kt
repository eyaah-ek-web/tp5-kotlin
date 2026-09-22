data class Product(
    val name: String,
    val price: Double,
    val quantity: Int
) {

    fun prixTotal(): Double {
        return price * quantity
    }

    fun afficherDetails() {
        println("Nom : $name")
        println("Prix : $price DH")
        println("Quantité : $quantity")
        println("Prix total : ${prixTotal()} DH")
    }
}

fun main() {
    val product = Product("Ordinateur", 5000.0, 2)

    product.afficherDetails()
}
