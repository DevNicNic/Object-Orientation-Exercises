import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número:")
    val numero = reader.nextInt()
    if(numero % 2 == 0){
        println("Você digitou o número $numero e ele é PAR.")
    }else {
        println("Você digitou o número $numero e ele é IMPAR. ")
    }

}