package arquivosDeUmaPagina

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número: ")
    val numero1 = reader.nextInt()
    println("Digite um número: ")
    val numero2 = reader.nextInt()
    println("Digite um número: ")
    val numero3 = reader.nextInt()
    val totalNumeros = when {
        numero1 > numero2 && numero1 > numero3 -> "Dos 3 números digitados o MAIOR é $numero1"
        numero2 > numero1 && numero2 > numero3 -> " Dos 3 números digitados o MAIOR é $numero2"
        numero3 > numero1 && numero3 > numero2 -> " Dos 3 números digitados o MAIOR é $numero3"
        else -> "Nem vai aparecer"
    }
    println(totalNumeros)
    val totalNumeros2 = when {
        numero1 < numero2 && numero1 < numero3 -> " Dos 3 números digitados o MENOR é $numero1"
        numero2 < numero1 && numero2 < numero3 -> " Dos 3 números digitados o MENOR é $numero2"
        numero3 < numero1 && numero3 < numero2 -> "Dos 3 Números digitados o MENOR é $numero3"
        else -> "Nem vai aparecer"
    }
    println(totalNumeros2)
}