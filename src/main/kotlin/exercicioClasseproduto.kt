fun main() {
    val produto = Produto()
    produto.nome = "Televisão"
    produto.preco = 3500.0
    produto.quantidadeEmEstoque = 10

    println("Nome do produto : ${produto.nome}")
    println("Preço do produto: ${produto.preco}")
    println("Quantidade em Estoque: ${produto.quantidadeEmEstoque}")
    println()
    println("Adicionando ao Estoque.")
    produto.adicionarEstoque(5)
    println("Quantidade ainda disponivel : ${produto.quantidadeEmEstoque}")
    println()
    println("Efetuando uma venda.")
    println(produto.vender(20))
    println("Quantidade ainda disponivel : ${produto.quantidadeEmEstoque}")

}

class Produto {
    var nome = ""
    var preco = 0.0
    var quantidadeEmEstoque = 0

    fun adicionarEstoque(valor: Int) {
        quantidadeEmEstoque += valor
    }

    fun vender(quantidadeVender: Int): String {
        if (quantidadeEmEstoque >= quantidadeVender) {
            quantidadeEmEstoque -= quantidadeVender
            return "Venda Realizada com Sucesso."
        } else {
            return "Estoque Insuficiente."
        }


    }
}