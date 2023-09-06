import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite sua idade: ")
    val idade = reader.nextInt()
    if (idade >= 18 && idade <= 70) {
        println("VOTO OBRIGATORIO")
    } else if (idade == 16 || idade == 17) {
        println("VOTO FACULTATIVO")
    } else if (idade < 16) {
        println("Não é necessário votar")
    }else if (idade > 70){
        println("VOTO FACULTATIVO")
    }
}