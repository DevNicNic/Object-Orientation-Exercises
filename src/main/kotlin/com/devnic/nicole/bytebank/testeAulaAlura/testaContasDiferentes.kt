package com.devnic.nicole.bytebank.testeAulaAlura

import com.devnic.nicole.bytebank.modeloAulaAlura.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "555.555.555-55",
            senha = 5,
            endereco = Endereco(
                logradouro = "Rua: João Assis de Castro")
        ),
        numero = 1000
    )
    println("Titular")
    println("Nome do Titular ${contaCorrente.titular.nome}")
    println("Cpf do titular ${contaCorrente.titular.cpf}")
    println("Endereço Titular: ${contaCorrente.titular.endereco.logradouro}")
    println()

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", cpf = "777.777.777-7", senha = 7),
        numero = 1001
    )
     val contaSalario = ContaSalario (
         titular = Cliente(nome = "Nic", cpf = "888.888.888-8", senha = 8),
         numero = 1002
     )



    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("Saldo Corrente : ${contaCorrente.saldo}")
    println("Saldo Poupança : ${contaPoupanca.saldo}")
    println("Saldo Conta Salario: ${contaSalario.saldo}")
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("Saldo após saque corrente: ${contaCorrente.saldo}")
    println("Saldo após saque poupança: ${contaPoupanca.saldo}")
    println("Saldo após saque salario: ${contaSalario.saldo}")
    println()

    contaCorrente.transfere(100.0, contaPoupanca)
    contaPoupanca.transfere(100.0 , contaSalario)

    println("Saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após receber transferência: ${contaPoupanca.saldo}")
    println("saldo salario após receber Tranferencia; ${contaSalario.saldo}")
    println()

    contaPoupanca.transfere(200.0, contaCorrente)

    println("Saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("Saldo corrente após receber transferência: ${contaCorrente.saldo}")


}