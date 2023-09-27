class ContaCorrenteExercicio(
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
            this.saldoExercicio -= valor
            println("Saque realizado com sucesso!")
        } else {
            println("Saldo insuficiente para saque!")
        }


    }
}