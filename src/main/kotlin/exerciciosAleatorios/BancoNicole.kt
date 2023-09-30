package exerciciosAleatorios

open class BancoNicole(
    val nome: String,
    var saldo: Double = 0.0
) {
    fun sacarOutravez(valor: Double) {
        if (saldo > valor) {
            saldo -= valor
        } else {
            println("Saldo insuficiente")
        }

    }

    fun depositarDenovo(valor: Double) {
        if (valor > 0) {
            saldo += valor
        } else {
            println("Não é permitido depositar valor negativo")
        }

    }

    fun imprimiSaldo() {
        println("Saldo atual : ${this.saldo}")

    }

}