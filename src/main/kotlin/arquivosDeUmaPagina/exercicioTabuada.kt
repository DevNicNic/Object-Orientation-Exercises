package arquivosDeUmaPagina

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número para ver sua Tabuada: ")
    val numero = reader.nextInt()
    for(tabuada in 1..10){
        val resultado = numero * tabuada
        println("$numero x $tabuada = $resultado ")
    }
}