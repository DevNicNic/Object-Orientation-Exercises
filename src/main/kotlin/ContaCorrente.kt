class ContaCorrente(
    titular: String,
    numero: Int
) : ContaBancaria(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.saca(valorComTaxa)
    }
}






