package com.devnic.nicole.bytebank.modeloAulaAlura

class CalculadoraBonificacao {
    var total : Double = 0.0
        private set

    fun registra( funcionario: Funcionario){
        if (funcionario is Funcionario)
        this.total += funcionario.bonificacao()
    }

}


