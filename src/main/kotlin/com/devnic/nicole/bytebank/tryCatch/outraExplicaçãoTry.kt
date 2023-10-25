package com.devnic.nicole.bytebank.tryCatch

fun main() {
    val textoPraImprimir = try { // aqui falamos pro programa , "tente executar essa função", se ela der erro faça o que esta no catch
        outraFuncaoPerigosa()
    } catch (e: NumberFormatException){
        // Você pode eventualmente usar o try para retornar algum valor.
        // Porque? Por que a sua função perigosa retorna um valor.
        // Nesse caso, não precisamos usar a palavra chave return.
        // Basta deixar por ultimo o que queremos retornar.
        // Nesse caso não iremos executar uma função aqui, por qualquer motivo.
        // Sei la , to revoltada e prefiro executar a ação fora do meu bloco try.
        // ja que vamos usar o try pra retornar um valor, podemos coloca-lo dentro de uma val.
        // e usarmos essa val como quisermos depois.
        "Você precisa digitar um número , mas digitou um texto"
    }
    // aqui estamos fora do try , colocamos o retorno dele na val textoPraImprimir
    println(textoPraImprimir)
}
fun outraFuncaoPerigosa (): Int {
    val num = "Uma coisa que o usuário digitou".toInt()
    return num

}
