package exerciciosAleatorios

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número: ")
    val numero = reader.nextInt()
    val resultado= when {
         numero < 0 -> "Número digitado é Negativo"
         numero > 0 -> "Número digitado é Positivo"
         numero == 0 -> "Número digitado é Zero"
         else -> "Opção Invalida"
    }
        println(resultado)
}