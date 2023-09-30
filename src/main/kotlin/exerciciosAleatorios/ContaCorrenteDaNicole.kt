package exerciciosAleatorios

class ContaCorrenteDaNicole(
    nome: String,
    saldo: Double,
    val limite: Double
) : BancoNicole(
    nome = nome,
    saldo = saldo,
) {
    fun imprimirLimite() {
        println("Limite de Crédito: ${this.limite}")
    }
}


