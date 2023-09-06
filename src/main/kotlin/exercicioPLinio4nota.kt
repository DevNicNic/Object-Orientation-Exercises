import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite sua nota 1: ")
    val nota1 = reader.nextFloat()
    println("Digite sua nota 2: ")
    val nota2 = reader.nextFloat()
    val soma = nota1 + nota2
    val media = soma / 2
    println("Sua média foi $media.")
    if(media >= 6.5){
        println("Parabéns vc foi APROVADO!!!")
    }else if(media <= 4 ){
        println("Sinto muito você foi REPROVADO! Estude mais!")
    }else if (media >4 && media < 5){
        println("Você esta de Recuperação.")
    }
}