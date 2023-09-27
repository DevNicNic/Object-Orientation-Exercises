package arquivosDeUmaPagina

import java.util.Scanner

fun main() {
    val reader = Scanner (System.`in`)
    println("Digite o dia do seu nascimento: ")
    val numero1 = reader.nextInt()
    println("Digite o mês de nascimento: ")
    val numero2 = reader.nextInt()
    println("Digite o ano de nascimento: ")
    val numero3 = reader.nextInt()
    println(" Sua data de Nascimento é : $numero1 / $numero2 / $numero3")
}