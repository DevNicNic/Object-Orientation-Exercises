package com.devnic.nicole.bytebank.modeloAulaAlura

import com.devnic.nicole.bytebank.exception.SaldoInsuficienteException


abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : ContaBancaria(
    titular = titular,
    numero = numero
) {

    fun transfere(valor: Double, destino: ContaBancaria) {
        if (saldo < valor) {
            throw SaldoInsuficienteException()
        }
        saldo -= valor
        destino.deposita(valor)


    }

}