import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número: ")
    val numero1 = reader.nextInt()
    println("Digite outro número: ")
    val numero2 = reader.nextInt()
    val soma = numero1 + numero2
    println("Você digitou os números $numero1 e $numero2 , a soma entre eles é $soma")

}