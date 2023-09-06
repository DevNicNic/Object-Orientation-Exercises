import java.util.Scanner

fun main() {
    val reader = Scanner (System.`in`)
    println("Qual a altura da parede em metros?: ")
    val altura = reader.nextFloat()
    println("Qual o comprimento da parede em metros?: ")
    val comprimento = reader.nextFloat()
    val area = altura * comprimento
    val tinta = area / 2
    val areaFormatado = String.format("% .2f",area)
    println("A Area da sua parede é $areaFormatado m²")
    println("A quantidade de litros de tinta utilizada sera: $tinta litros")
}