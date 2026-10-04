enum class DayOfWeek {LUNDI,MARDI,MERCREDI,JEUDI,VENDREDI,SAMEDI,DIMANCHE}
fun afficherMessage(jour: DayOfWeek) {
    when (jour) {
        DayOfWeek.LUNDI -> println("Lundi : début de la semaine")
        DayOfWeek.MARDI -> println("Mardi : deuxième jour")
        DayOfWeek.MERCREDI -> println("Mercredi : milieu de la semaine")
        DayOfWeek.JEUDI -> println("Jeudi : bientôt le week-end")
        DayOfWeek.VENDREDI -> println("Vendredi : presque le week-end")
        DayOfWeek.SAMEDI -> println("Samedi : profitez du week-end")
        DayOfWeek.DIMANCHE -> println("Dimanche : dernier jour du week-end")
    }
}
fun main() {
    afficherMessage(DayOfWeek.LUNDI)
    afficherMessage(DayOfWeek.VENDREDI)
}
