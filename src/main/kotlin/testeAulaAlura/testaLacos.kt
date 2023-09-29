package testeAulaAlura

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