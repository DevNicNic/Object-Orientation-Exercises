package arquivosDeUmaPagina

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número: ")
    val numero = reader.nextInt()
    if(numero < 0) {
        println(" O Número digitado é Negativo")
    }else if (numero > 0){
        println("O Número digitado é Positivo")
    }else if(numero == 0){
        println("Você digitou 0 ")
    }
}