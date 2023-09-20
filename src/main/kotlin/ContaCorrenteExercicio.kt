class ContaCorrenteExercicio (
    saldoExercicio : Double
) : ContaBancariaExercicio (saldoExercicio = saldoExercicio ) {

    override fun depositarExercicio(valor: Double) {
        super.depositarExercicio(valor)
    }

    override fun sacarExercicio(valor: Double) {

        super.sacarExercicio(valor)
    }
}