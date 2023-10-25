package com.devnic.nicole.bytebank.tryCatch

fun main() {
    val convercao = try {
        converter()
    } catch (e: NumberFormatException) {
        "O que você digitou não é um número, tente outra vez."
    }

    println(convercao)
}


fun converter(): Int {
    val convertido = "123".toInt()
    return convertido
}