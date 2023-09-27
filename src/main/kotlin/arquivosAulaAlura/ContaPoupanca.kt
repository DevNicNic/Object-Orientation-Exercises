package arquivosAulaAlura

import ContaBancaria

class ContaPoupanca(
    titular: String,
    numero: Int
) : ContaBancaria(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor


        }
    }
}