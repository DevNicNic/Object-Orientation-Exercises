package exerciciosAleatorios

fun main() {
    val saldoExercicio  = ContaCorrenteExercicio(
        saldoExercicio = 1000.0
    )
    println("Saldo:R$ ${saldoExercicio.saldoExercicio}")
    println("Depositando um valor.")
    saldoExercicio.depositarExercicio(100.0)
    println("Saldo: R$ ${saldoExercicio.saldoExercicio}")
    saldoExercicio.sacarExercicio(100.0)
    println("Saldo: R$ ${saldoExercicio.saldoExercicio}")
    println()

    val saldoContaPoupanca = ContaPoupancaExercicio(
        saldoExercicio = 2000.0
    )
    println("Saldo:R$ ${saldoContaPoupanca.saldoExercicio}")
    println("Depositando um valor.")
    saldoContaPoupanca.depositarExercicio(100.0)
    println("Saldo: R$ ${saldoContaPoupanca.saldoExercicio}")
    saldoContaPoupanca.sacarExercicio(100.0)
    println("Saldo: R$ ${saldoContaPoupanca.saldoExercicio}")
    println()

    val saldoContaCorrente = ContaCorrenteExercicio(
        saldoExercicio = 3000.0
    )

    println("Saldo:R$ ${saldoContaCorrente.saldoExercicio}")
    println("Depositando um valor.")
    saldoContaCorrente.depositarExercicio(100.0)
    println("Saldo: R$ ${saldoContaCorrente.saldoExercicio}")
    saldoContaCorrente.sacarExercicio(300.0)
    println("Saldo: R$ ${saldoContaCorrente.saldoExercicio}")

}

