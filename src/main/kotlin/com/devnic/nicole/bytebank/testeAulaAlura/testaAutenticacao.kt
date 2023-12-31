package com.devnic.nicole.bytebank.testeAulaAlura

import com.devnic.nicole.bytebank.modeloAulaAlura.Cliente
import com.devnic.nicole.bytebank.modeloAulaAlura.Diretor
import com.devnic.nicole.bytebank.modeloAulaAlura.Gerente
import com.devnic.nicole.bytebank.modeloAulaAlura.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome1 = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome1 = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sitema = SistemaInterno()
    sitema.entra(gerente, senha = 1000)
    sitema.entra(diretora, senha = 2000)
    sitema.entra(cliente, senha = 1234)


}