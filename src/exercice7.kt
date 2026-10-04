enum class OrderStatus {PENDING,SHIPPED,DELIVERED,CANCELLED}
class Order(var status: OrderStatus)
fun changerStatut(order: Order) {
    when (order.status) {
        is OrderStatus.PENDING -> {
            order.status = OrderStatus.SHIPPED
            println("La commande est maintenant EXPÉDIÉE (SHIPPED).")
        }
        is OrderStatus.SHIPPED -> {
            order.status = OrderStatus.DELIVERED
            println("La commande est maintenant LIVRÉE (DELIVERED).")
        }
        is OrderStatus.DELIVERED -> {
            println("La commande est déjà livrée, aucun changement.")
        }
        is OrderStatus.CANCELLED -> {
            println("La commande est annulée, impossible de changer le statut.")
        }
    }
}
fun main() {
    val commande = Order(OrderStatus.PENDING)
    println("Statut initial : ${commande.status}")
    changerStatut(commande)
    println("Nouveau statut : ${commande.status}")
    changerStatut(commande)
    println("Nouveau statut : ${commande.status}")
}
