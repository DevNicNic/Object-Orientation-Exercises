package com.devnic.nicole.bytebank.testeAulaAlura

import exerciciosAleatorios.Conta
import exerciciosAleatorios.deposita

fun testaComportamentos() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0


    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()

    println("Depositando na Conta do Alex.")
    deposita(contaAlex, 50.0)
    println(contaAlex.saldo)
    println()
    println("Depositando na Conta da Fran.")
    deposita(contaFran, 70.0)
    println(contaFran.saldo)
}