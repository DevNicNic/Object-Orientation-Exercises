package com.devnic.nicole.bytebank

import com.devnic.nicole.bytebank.modeloAulaAlura.Cliente
import com.devnic.nicole.bytebank.modeloAulaAlura.Endereco
import com.devnic.nicole.bytebank.testeAulaAlura.testaFuncionarios
import java.util.Objects


fun main() {


    val endereco = Endereco()

    val objeto : Any = Any()


    imprime(objeto)

    imprime(1)
    imprime(1.0)
    val teste: Any = imprime(endereco)
    println(teste)

    testaFuncionarios()

}

fun imprime(valor: Any): Any{
    println(valor)
    return valor

}












