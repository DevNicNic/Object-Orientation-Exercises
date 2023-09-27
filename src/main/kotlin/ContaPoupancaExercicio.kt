class ContaPoupancaExercicio(
    saldoExercicio: Double
) : ContaBancariaExercicio(saldoExercicio = saldoExercicio) {

    override fun depositarExercicio(valor: Double) {
        if (valor > 0) {
            this.saldoExercicio += valor
            println("Deposito bem sucedido!")
        }

    }

    override fun sacarExercicio(valor: Double) {
        if (saldoExercicio >= valor) {
            val taxaExercicio = valor * 0.1
            this.saldoExercicio -= valor
            this.saldoExercicio -= taxaExercicio
            println("Saque realizado com sucesso!")
        } else {
            println("Saldo Insuficiente!")

        }


    }
}