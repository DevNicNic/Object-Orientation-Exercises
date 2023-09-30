package exerciciosAleatorios

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite o salario do Funcionário: R$ ")
    val salarioSemAumento = reader.nextFloat()
    val aumento1 = salarioSemAumento / 100 * 10
    val aumento2 = salarioSemAumento / 100 * 15
    val totalAumento1 = aumento1 + salarioSemAumento
    val totalAumento2 = aumento2 + salarioSemAumento
    val resultado = when {
        salarioSemAumento > 1250 -> "O aumento sera de 10% deixando o salário no total de R$ $totalAumento1"
        salarioSemAumento <= 1250 -> "O aumento sera de 15% deixando o salário no tatal de R$ $totalAumento2"
        else -> "Não precisa dessa opção kkkk"
    }
    println(resultado)
}