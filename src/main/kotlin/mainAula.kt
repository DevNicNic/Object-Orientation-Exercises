fun main() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo Corrente : ${contaCorrente.saldo}")
    println("Saldo Poupança : ${contaPoupanca.saldo}")
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo após saque corrente: ${contaCorrente.saldo}")
    println("Saldo após saque poupança: ${contaPoupanca.saldo}")
    println()

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após receber transferência: ${contaPoupanca.saldo}")
    println()

    contaPoupanca.transfere(200.0, contaCorrente)

    println("Saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("Saldo corrente após receber transferência: ${contaCorrente.saldo}")


}






