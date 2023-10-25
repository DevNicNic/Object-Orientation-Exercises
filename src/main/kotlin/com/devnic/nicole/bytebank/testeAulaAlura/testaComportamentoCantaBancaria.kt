package com.devnic.nicole.bytebank.testeAulaAlura

import com.devnic.nicole.bytebank.exception.SaldoInsuficienteException
import com.devnic.nicole.bytebank.modeloAulaAlura.Cliente
import com.devnic.nicole.bytebank.modeloAulaAlura.ContaCorrente
import com.devnic.nicole.bytebank.modeloAulaAlura.ContaPoupanca

fun testaComportamentoCantaBancaria() {
    val alex = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1)
    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println()
    val fran = Cliente(nome = "Fran", cpf = "222.222.222-22", senha = 2)
    val contaFran = ContaPoupanca(titular = fran, numero = 1001)
    contaFran.deposita(300.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()


    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)
    println()
    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)
    println()

    println("Sacando da Conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)
    println()
    println("Sacando da Conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)
    println()
    println("Saque em exesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)
    println()
    println("Saque em exesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)
    println()
    println("Transferência da conta da Fran para o Alex")

    try {
        contaFran.transfere(valor = 100.0, destino = contaAlex)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException){
        println("Falha na transferência")
        println("Saldo Insuficiente")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}