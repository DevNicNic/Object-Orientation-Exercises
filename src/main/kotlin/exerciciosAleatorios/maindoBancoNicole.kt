package exerciciosAleatorios

fun main() {
    val dadosConta = BancoNicole(nome = "NicBank")

    dadosConta.depositarDenovo(valor = 500.0)
    dadosConta.sacarOutravez(valor = 200.0)
    println(dadosConta.nome)
    dadosConta.imprimiSaldo()
    println()
    println("Dados de outra Conta...")
    val dadosContaNic = ContaCorrenteDaNicole(nome = "NicBank", saldo = 2000.0, limite = 500.0)
    dadosContaNic.imprimiSaldo()
    dadosContaNic.imprimirLimite()

}
