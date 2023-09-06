import java.util.Scanner

fun main() {
    val reader = Scanner (System.`in`)
    println("Qual a quantia em dinheiro você tem : R$ ")
    val real = reader.nextFloat()
    val dolar = real / 4.99
    val dolarFormatado = String.format("% .2f", dolar)
    println("De acordo com o valor R$ $real você pode comprar US$ $dolarFormatado . ")
}