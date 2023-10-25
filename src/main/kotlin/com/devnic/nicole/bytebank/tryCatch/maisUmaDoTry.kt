package com.devnic.nicole.bytebank.tryCatch

fun main() {
    val textoPraImprimir = try {
        // se não tivermos o erro NumberFormatException
        // o programa não entra no catch, ele apenas vai executar a função perigosa e seguir o jogo
        // nessa caso nossa função perigosa apenas retrnara um valor
        // então esse valor vai ser atribuido a variavel textoPraImprimir.
        // que em seguida será usada no nosso println
        maisUmaPerigosa()
    } catch (e: NumberFormatException){
        "Voocê precisa digitar um número mas digitou um texto."
    }
    println(textoPraImprimir)
}

fun maisUmaPerigosa ():Int {
    val num = "100".toInt()
    return num
}