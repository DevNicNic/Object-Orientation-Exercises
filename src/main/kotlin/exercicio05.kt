import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número: ")
    val numero = reader.nextInt()
    val antecessor = numero - 1
    val sucessor = numero + 1
    println("Você digitou o número $numero e seu antecessor é $antecessor e seu sucessor $sucessor.")
}