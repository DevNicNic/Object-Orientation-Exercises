package com.devnic.nicole.bytebank

import com.devnic.nicole.bytebank.modeloAulaAlura.Cliente
import com.devnic.nicole.bytebank.modeloAulaAlura.Endereco
import com.devnic.nicole.bytebank.testeAulaAlura.testaFuncionarios
import java.util.Objects


fun main() {


    val endereco = Endereco(logradouro = "Rua Henrique Scheveng", numeroEndereco = 1000)
    val enderecoNovo = Endereco(bairro = "Jardim Vitória", complemento = "Eu sou demais")

    println(endereco.equals(endereco))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${
        Integer.toHexString(endereco.hashCode())}")





}

fun imprime(valor: Any): Any{
    println(valor)
    return valor

}












