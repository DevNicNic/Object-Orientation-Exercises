import java.util.Scanner

fun main() {
    val reader = Scanner (System.`in`)
    println("Qual a velocidade do carro? ")
    val velocidade = reader.nextInt()
    if(velocidade > 80){
        println("VC ULTRAPASSOU O LIMITE DE VELOCIDADE!")
        val multa = (velocidade - 80) *7
        println("O valor da multa a ser paga sera R$ $multa")
    }else {
        println("DIRIJA COM CUIDADO E TENHA UMA ÓTIMA VIAGEM!")
    }

}