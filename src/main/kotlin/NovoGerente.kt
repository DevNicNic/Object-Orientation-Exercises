class NovoGerente(
    nomeFuncionario : String,
    salarioFuncionario: Double
): novoFuncionario(
    nomeFuncionario = nomeFuncionario,
    salarioFuncionario = salarioFuncionario
) {
    override fun calcularNovaBonificacao(): Double {
        val novoCalculoBonificacao = salarioFuncionario * 0.2
        val totalNovoCalculo = salarioFuncionario + novoCalculoBonificacao
        this.salarioFuncionario = totalNovoCalculo
        println("Como vendedor vc recebera 20% de bonificação no seu salário.")
        return totalNovoCalculo
    }

}