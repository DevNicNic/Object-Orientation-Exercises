package com.devnic.nicole.bytebank.modeloAulaAlura

abstract class Funcionario(
    val nome1: String,
    val cpf: String,
    val salario: Double,

) {
      abstract  fun bonificacao(): Double



}