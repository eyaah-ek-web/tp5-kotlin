data class User(val id: Int, val nom: String, val email: String)
fun afficherUtilisateursGmail(users: List<User>) {
    for (user in users) {
        if (user.email.endsWith("@gmail.com")) {
            println(user.nom)
        }
    }
}
fun main() {
    val users = listOf(
        User(1, "Alice", "alice@gmail.com"),
        User(2, "Bob", "bob@yahoo.com"),
        User(3, "Charlie", "charlie@gmail.com"),
        User(4, "David", "david@hotmail.com")
    )
    afficherUtilisateursGmail(users)
}
