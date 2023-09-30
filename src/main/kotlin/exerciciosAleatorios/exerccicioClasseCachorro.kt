package exerciciosAleatorios

fun main() {

    val cachorroDaNicole = Cachorro()
    cachorroDaNicole.nome = "Zeus"
    cachorroDaNicole.idade = 10
    cachorroDaNicole.raca = "PitLata"

    println(cachorroDaNicole.nome)
    println(cachorroDaNicole.idade)
    println(cachorroDaNicole.raca)
    println()
    cachorroDaNicole.latir()
    cachorroDaNicole.brincar()


}
class Cachorro {
    var nome = ""
    var idade = 0
    var raca = ""

    fun latir(){
        println("Cachorro Latindo" )
    }
    fun brincar(){
        println("Cachorro Brincado")
    }
}