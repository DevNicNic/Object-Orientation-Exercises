package com.devnic.nicole.bytebank.testeAulaAlura

import com.devnic.nicole.bytebank.modeloAulaAlura.Cliente
import com.devnic.nicole.bytebank.modeloAulaAlura.ContaCorrente
import com.devnic.nicole.bytebank.modeloAulaAlura.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "333.333.333-3", senha = 3)
    val maria = Cliente(nome = "Maria", cpf = "444.444.444-44", senha = 4)

    val contaJoao = ContaCorrente(titular = joao, numero = 1002) //cada conta deve ter seu objeto, por ser um espaço separado na memoria ou seja uma referencia
    var contaMaria = ContaPoupanca(titular = maria, numero = 1002)



    println("titular conta joao : ${contaJoao.titular.nome}")
    println("titular conta maria : ${contaMaria.titular.nome}")

    println(contaMaria)
    println(contaJoao)

}