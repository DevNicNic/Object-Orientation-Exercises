package exerciciosAleatorios

class NovoVendedor(
    nomeFuncionario : String,
    salarioFuncionario: Double
): novoFuncionario(
    nomeFuncionario = nomeFuncionario,
    salarioFuncionario = salarioFuncionario
) {
    override fun calcularNovaBonificacao(): Double {
        val novoCalculoBonificacao = salarioFuncionario * 0.1
        val totalNovoCalculo = salarioFuncionario + novoCalculoBonificacao
        this.salarioFuncionario = totalNovoCalculo
        println("Como vendedor vc recebera 10% de bonificação no seu salário.")
        return totalNovoCalculo

    }
}

