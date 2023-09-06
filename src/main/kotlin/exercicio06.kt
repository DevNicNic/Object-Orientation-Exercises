
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número: ")
    val numero = reader.nextInt()
    val dobro = numero * 2
    val triplo = numero * 3
    val raizQuadrada = Math.sqrt(numero.toDouble()) //calcular a raiz quadrada
    val resultadoFormatado = String.format("%.1f", raizQuadrada)
    println("O número digitado foi $numero.\n Seu dobro é: $dobro \n Seu triplo é : $triplo \n Sua raiz quadrada é $resultadoFormatado ")
}