import java.util.Scanner


fun main() {
    val reader = Scanner(System.`in`)
    println("Digite o valor do produto : R$")
    val precoProduto = reader.nextDouble()
    println("Qual a porcentegem do desconto ? % ")
    val percentualDesconto = reader.nextDouble()
    val totalValorComDesconto = calcularDesconto(precoProduto, percentualDesconto)
    println("O Valor inicial do produto é R$ $precoProduto.")
    println("O valor do desconto é de $percentualDesconto % e o total com desconto é R$ $totalValorComDesconto ")

}

fun calcularDesconto (precoProduto: Double, percentualDesconto: Double ):Double {
    val desconto = precoProduto * ( percentualDesconto / 100)
    return precoProduto - desconto

}