sealed class Payment {
    class CashPayment(var amount: Int) : Payment()
    class DigitalPayment(var amount: Int, var cardNumber: String) : Payment()
    class CardPayment(var amount: Int, var cardNumber: String) : Payment()
}
    fun afficher(payment: Payment){
        when (payment){
            is Payment.CashPayment -> {
                println("Type de paiement est : Cach")
                println("Amount: ${payment.amount}")
            }
            is Payment.DigitalPayment -> {
                println("Type de paiement est : Digital")
                println("Amount: ${payment.amount}")
                println("CardNumber: ${payment.cardNumber}")
            }
            is Payment.CardPayment -> {
                println("Type de paiement est : Card")
                println("Amount: ${payment.amount}")
                println("CardNumber: ${payment.cardNumber}")

            }
        }
    }

fun main(){
    var payment1 = Payment.CashPayment(5000)
    var payment2 = Payment.DigitalPayment(2000, "21454470")
    var payment3 = Payment.CardPayment(7000, "49588755")
    afficher(payment1)
    afficher(payment2)
    afficher(payment3)
}