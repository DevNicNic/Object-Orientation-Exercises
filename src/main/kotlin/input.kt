import java.util.Scanner

fun main() {
    println("Qual seu nome? ")
    val text = readLine()
    println("Muito prazer $text ")

    val reader = Scanner(System.`in`)
    println("Digite um número: ")
    val numero = reader.nextInt()
    val soma = numero + 5

    println("Vc digitou $numero e a soma dos valores é $soma")
}