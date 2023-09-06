import java.util.Scanner

fun main() {
    val reader = Scanner (System.`in`)
    println("Digite a quantidade de Km rodados pelo seu carro :" )
    val kmRodados = reader.nextInt()
    println("Digite a quantidade de dias para qual ele foi alugado: ")
    val diasAlugado = reader.nextInt()
    val totalDias = diasAlugado * 60
    val totalKm = kmRodados * 0.15
    val precoApagar = totalKm + totalDias
    val precoApagarFomatado = String.format("%.2f", precoApagar)
    println("O preço a pagar pelo aluguel do carro é R$ $precoApagarFomatado")
}