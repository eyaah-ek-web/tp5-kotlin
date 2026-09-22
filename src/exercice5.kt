class Box(val size: Int) {
    inner class Item(val name: String) {
        fun printDetails() {
            println("Taille de la Box : $size")
            println("Nom de l'Item : $name")
        }
    }
}
fun main() {
    val box = Box(10)
    val item = box.Item("Livre")

    item.printDetails()
}
