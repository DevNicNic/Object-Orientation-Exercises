fun main() {
    println("BEM VINDO AO NICOLE BANK")
    println()

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

fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor

}

    class Conta {
        var titular = ""
        var numero = 0
        var saldo = 0.0
    }




fun testaLacos() {
    var i = 0
    while (i < 5) {

        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0


        println("Saldo da Conta $saldo")
        println("Titular $titular")
        println("Numero da Conta $numeroConta")
        println()
        i++ //incremento adiciona mais 1 na variavel
    }
    for (i in 5 downTo 1 step 2) {
        if (i == 4) {
            continue
        }
        println("BEM VINDO AO NICOLE BANK")
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0


        println("Saldo da Conta $saldo")
        println("Titular $titular")
        println("Numero da Conta $numeroConta")
        println()


    }
}

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