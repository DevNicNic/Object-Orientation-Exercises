abstract class ContaBancariaExercicio(
    var saldoExercicio: Double
) {

    abstract fun depositarExercicio(valor: Double)

    abstract fun sacarExercicio(valor: Double)

}