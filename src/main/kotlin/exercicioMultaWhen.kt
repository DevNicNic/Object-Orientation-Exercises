import java.util.Scanner

fun main() {
    val reader = Scanner (System.`in`)
    println("Velocidade do carro : " )
    val velocidade = reader.nextInt()
    val multa = (velocidade - 80) * 7
    val resultado = when {
        velocidade > 80 -> "VC ULTRAPASSOU O LIMITE DE VELOCIDADE! E TERA QUE PAGAR UMA MULTA NO VALOR DE R$ $multa "

        else -> "DIRIJA COM CUIDADO E TENHA UMA BOA VIAGEM !"
    }
    println(resultado)
}