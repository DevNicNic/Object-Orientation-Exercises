package arquivosDeUmaPagina

import java.util.Scanner

fun main() {
    val reader = Scanner ( System.`in`)
    println("Digite sua idade para saber se precisa votar: ")
    val idade = reader.nextInt()
    val resultado = when{
        idade >= 18 && idade <= 70 -> "Voto Obrigatório"
        idade == 16 -> "Voto facultativo"
        idade == 17 -> "Voto facultativo"
        idade < 16 -> "Não é necessário votar"
        idade > 70 -> "Voto Facultativo"
        else -> "Opção Invalida "
    }
    println(resultado)
}