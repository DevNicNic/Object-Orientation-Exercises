package arquivosDeUmaPagina

import java.util.Scanner

fun main() {
    val reader = Scanner (System.`in`)
    println("Qual o valor do produto? R$ ")
    val preco = reader.nextFloat()
    val desconto = preco - (preco / 100 * 5)
    val descontoFormatado = String.format("% .2f", desconto)
    println("O Valor do produto com 5 % de desconto é R$ $descontoFormatado")
}