package exerciciosAleatorios

fun main() {
    val carroNicole = Carro()
    carroNicole.modelo = "CrosssFox 1.6"
    carroNicole.ano = 2005
    carroNicole.cor = "Verde Escuro"
    println(carroNicole.modelo)
    println(carroNicole.ano)
    println(carroNicole.cor)
    println()
    carroNicole.ligar()
    carroNicole.acelerar()

}

class Carro {
    var modelo = ""
    var ano = 0
    var cor = ""

    fun ligar() {
        println("Carro Ligado")
    }

    fun acelerar() {
        println("Carro Acelerando!")
    }

}