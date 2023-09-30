package com.devnic.nicole.bytebank.testeAulaAlura

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("A conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta neutra")
    } else {
        println("Conta negativa")


    }

    when {
        saldo > 0.0 -> println("Conta é positiva ")
        saldo == 0.0 -> println("Conta Neutra")
        else -> println("Conta Negativa")


    }


}