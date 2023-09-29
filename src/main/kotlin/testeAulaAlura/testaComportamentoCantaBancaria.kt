package testeAulaAlura

import modeloAulaAlura.ContaCorrente
import modeloAulaAlura.ContaPoupanca

fun testaComportamentoCantaBancaria() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println()
    val contaFran = ContaPoupanca(titular = "Fran", numero = 1001)
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

    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)
}