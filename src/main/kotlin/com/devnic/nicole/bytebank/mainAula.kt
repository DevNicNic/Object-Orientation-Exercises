package com.devnic.nicole.bytebank

import com.devnic.nicole.bytebank.exception.SaldoInsuficienteException
import com.devnic.nicole.bytebank.testeAulaAlura.testaComportamentoCantaBancaria
import kotlin.io.println as println1


fun main() {
    println1("início main")
    testaComportamentoCantaBancaria()
    println1("fim main")
}
fun funcao1() {
    println1("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println1("SaldoInsuficienteException foi pegada")
    }

    println1("fim funcao1")
}
fun funcao2() {
    println1("início funcao2")
    for (i in 1..5) {
        println1(i)
        throw SaldoInsuficienteException ()
    }
    println1("fim funcao2")
}














