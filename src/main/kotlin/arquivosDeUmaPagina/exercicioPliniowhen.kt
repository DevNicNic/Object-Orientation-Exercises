package arquivosDeUmaPagina

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número: ")
    val numero = reader.nextInt()
    val resultado = when{
        numero % 2 == 0 -> "Você digitou o número $numero e ele é PAR."
        else -> "Você digitou o número $numero e ele é IMPAR"
    }
    println(resultado)
}