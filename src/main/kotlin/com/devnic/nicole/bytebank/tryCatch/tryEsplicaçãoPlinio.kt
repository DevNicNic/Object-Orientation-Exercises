package com.devnic.nicole.bytebank.tryCatch

fun main() {
    try { // aqui falamos pro programa , "tente executar essa função", se ela der erro faça o que esta no catch
        umaFuncaoPerigosa()
    } catch (e: NumberFormatException){
        // aqui dizemos para o programa o que fazer quando houver o erro NumberFormatException
        // nesse caso estamos apenas printando uma mensagme amigavel para o usuário,
        // assim ele vai saber o que fez de errado, e vai tentar novamente.
        // Repare que nesse caso não retornamos valor algum, apenas executamos uma função , nesse caso a função
        // println que imprimi um texto no console.
        println("Você precisa digitar um número, mas digitou um texto")
    }

}
// fun apenas de exemplo, nesse caso sabemos que quando o programa tentar transformar uma string em int,
// o programa lançara o erro NumberFormatException, mas poderíamos não saber disso.
//Ex: O Usuário digitou um texto ao invés de um numero.
fun umaFuncaoPerigosa(){
    val num = "Uma coisa que o usuário digitou".toInt()
}