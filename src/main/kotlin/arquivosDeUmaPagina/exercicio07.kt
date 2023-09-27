package arquivosDeUmaPagina

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite sua nota: ")
    val nota1 = reader.nextFloat()
    println("Digite outra nota: ")
    val nota2 = reader.nextFloat()
    val soma = nota1 + nota2
    val media = soma / 2
    val resultadoFormatado = String.format("%.1f", media)
    println("Sua notas foram $nota1 e $nota2 \nSua média é $resultadoFormatado ")

}