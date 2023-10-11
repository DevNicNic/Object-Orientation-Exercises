package com.devnic.nicole.bytebank.modeloAulaAlura


//contrutor primario é o mais bem vindo
abstract class ContaBancaria(
    var titular: Cliente,
    val numero: Int
    //val teste : int = 9 opcional nao é obrigatorio mandar no parametro na hora da construção assim o valor sera o da properteis
) {
    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set


    }

    init {
        println("Criando Conta")
        Contador.total++
    }


//    constructor(titular: String, numero: Int){ // construtor secundario
//        this.titular = titular
//        this.numero = numero //inicialização
//    }


    fun deposita(valor: Double) { //função membro , metodos ou comportamento da classe
        if (valor > 0) {
            this.saldo += valor
        }

    }

    abstract fun saca(valor: Double)


//    fun getSaldo (): Double {
//        return saldo
//    }
//    fun setSaldo (valor: Double){
//        if (valor > 0){
//            saldo = valor
//        }
//
//
//    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {


    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa

        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {


    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor


        }
    }
}