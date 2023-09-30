package exerciciosAleatorios

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um ano para saber se ele é BISSEXTO: ")
    val ano = reader.nextInt()
    if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 ==0) {
        println("O ano $ano é BISSEXTO.")
    }else {
        println("O ano $ano NÂO é BISSEXTO.")
    }
}