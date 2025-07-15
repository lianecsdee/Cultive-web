/*Cultive+_Android*/
fun main() {
  print("Digite o nome da sua planta ")
    val nomePlanta = readLine()

    print("Digite o IDH do solo ")
    val idhSolo = readLine()?.toDoubleOrNull()

    val idhIdeal = 0.7

    if (idhSolo != null) {
        if (idhSolo >= idhIdeal) {
            println("$nomePlanta pode ser cultivado nesse solo ")
        } else {
            println("Não é ideal para o cultivo de $nomePlanta ")
        }
    } else {
        println("Valor de IDH é  inválido.")
    }
}