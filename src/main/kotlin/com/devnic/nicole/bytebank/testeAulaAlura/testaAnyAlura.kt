package com.devnic.nicole.bytebank.testeAulaAlura

import com.devnic.nicole.bytebank.modeloAulaAlura.Endereco
fun testaAnyAlura () {
    val endereco = Endereco(
        bairro = "Jardim Vitória",
        complemento = "Eu sou demais",
        cep = "00000-020"

    )
    val enderecoNovo = Endereco(
        bairro = "Jardim Vitória",
        complemento = "Eu sou demais",
        cep = "00000-020"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println(
        "${endereco.javaClass}@${
            Integer.toHexString(endereco.hashCode())
        }"
    )

}
fun imprime(valor: Any): Any{
    println(valor)
    return valor

}




