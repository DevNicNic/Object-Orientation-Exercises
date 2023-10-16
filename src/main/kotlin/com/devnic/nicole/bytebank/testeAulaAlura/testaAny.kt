package com.devnic.nicole.bytebank.testeAulaAlura

fun minhFuncao ( umParametroDeQualquerTipo: Any): Any {


    println("Vou etender $umParametroDeQualquerTipo")
    return String


}
fun main() {
    minhFuncao("Nicole")
    minhFuncao(45)
    minhFuncao(0.1)
}
