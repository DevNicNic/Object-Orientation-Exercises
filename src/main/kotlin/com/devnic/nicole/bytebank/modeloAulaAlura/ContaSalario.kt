package com.devnic.nicole.bytebank.modeloAulaAlura


class ContaSalario(
    titular: Cliente,
    numero: Int,
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