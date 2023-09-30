package exerciciosAleatorios

import java.util.Scanner

fun main() {
    val reader = Scanner (System.`in`)
    println("Digite o salario do funcionario: R$")
    val salario = reader.nextFloat()
    val aumento = salario / 100 * 15
    val salarioAumento = salario + aumento
    val salarioAumentoFormatado = String.format("%.2f", salarioAumento)
    println("O salario com aumento de 15 % é R$ $salarioAumentoFormatado")
}