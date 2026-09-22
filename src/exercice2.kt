sealed class OperationResult {
    class Success (var data : String): OperationResult()
    class Failure(var data : String, var errorMessage : String) : OperationResult()
    class Loading(var data : String, var errorMessage : String) : OperationResult()
}
fun gestionDetat(etat : OperationResult) {
    when (etat){
        is OperationResult.Success -> {
            println("Succès : ${etat.data}")
        }
        is OperationResult.Loading -> {
            println("Chargement : ${etat.data}")
            println("Erreur : ${etat.errorMessage}")

        }
        is OperationResult.Failure -> {
            println("Data : ${etat.data}")
            println("Erreur : ${etat.errorMessage}")
        }
    }
}
fun main(){
    var etat1 = OperationResult.Success("Hello")
    var etat2 = OperationResult.Failure("hello word", "erreur de...")
    var etat3 = OperationResult.Loading("My data", "loading.....")
//    gestionDetat(etat1)
//    gestionDetat(etat2)
    gestionDetat(etat3)


}