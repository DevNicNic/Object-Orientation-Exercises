package arquivosDeUmaPagina

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val computador = Random.nextInt(0, 5)
    println("============VAMOS TENTAR DESCOBRIR QUAL NÚMERO DE 0 A 5 O COMPUTADOR PENSOU=============")
    val reader = Scanner(System.`in`)
    println("Qual o seu palpite: ")
    val jogador = reader.nextInt()
    if(jogador == computador){
        println("PARABÉNS VC VENCEU!")
    }else if (jogador != computador){
        println("NÃO FOI DESSA VEZ!TENTE NOVAMENTE!")

    }
}