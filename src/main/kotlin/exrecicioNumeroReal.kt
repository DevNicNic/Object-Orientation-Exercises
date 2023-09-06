import java.util.Scanner
import kotlin.math.roundToInt

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número real: ")
    val numero = reader.nextFloat()
    val numeroEscolhido = numero.roundToInt()
    println("O número  digitado foi $numero e sua porção inteira é $numeroEscolhido ")
}