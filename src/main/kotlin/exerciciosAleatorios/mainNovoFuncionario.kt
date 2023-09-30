package exerciciosAleatorios

fun main() {
    val novoGerente = NovoGerente(
        nomeFuncionario = "Nicole",
        salarioFuncionario = 5000.0
    )
    println("Nome do modeloAulaAlura.Gerente: ${novoGerente.nomeFuncionario}")
    println("Salário sem bonificação: ${novoGerente.salarioFuncionario}")
    novoGerente.calcularNovaBonificacao()
    println("Total salário com bonificação: ${novoGerente.salarioFuncionario}")
    println()

    val novoVendedor = NovoVendedor(
        nomeFuncionario = "Michele",
        salarioFuncionario = 4000.0
    )
    println("Nome do Vendedor: ${novoVendedor.nomeFuncionario}")
    println("Salário sem bonificação: ${novoVendedor.salarioFuncionario}")
    novoVendedor.calcularNovaBonificacao()
    println("Total salário com bonificação: ${novoVendedor.salarioFuncionario}")

}

