import java.util.Scanner


fun main() {

    val reader = Scanner(System.`in`)
    println("Digite um número: ")
    val numero1 = reader.nextInt()
    val numero1Verificado = verificarNumeroPositivo(numero1)
    println(numero1Verificado)

}
fun verificarNumeroPositivo (numero : Int): String {
    if (numero >= 0) {
        return "VERDADEIRO"
    } else {
        return "FALSO"
    }
}
