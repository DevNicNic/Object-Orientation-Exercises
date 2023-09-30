package arquivosDeUmaPagina

class Pessoa(val nomePessoa: String)
class Motor(val taLigado: Boolean)
class Pneu(val taCareca: Boolean)
class Carro(
    val motorista: Pessoa,
    val motor: Motor,
    val pneu: Pneu
)

fun main() {
    val fulano = Pessoa(nomePessoa = "Fulano")
    val motor = Motor(taLigado = false)
    val pneu = Pneu(taCareca = false)

    val meuCarro = Carro(
        motorista = fulano,
        motor = motor,
        pneu = pneu
    )
    println("Nome do motorista: ${meuCarro.motorista.nomePessoa}")
    println("O carro esta ligado?: ${meuCarro.motor.taLigado}")
    println("O pneu esta careca?: ${meuCarro.pneu.taCareca}")
    println()

    println(
        """ Meu carro ta ligado ? ${motor.taLigado}
        Quem dirige? ${fulano.nomePessoa}
        O pneu ta careca? ${pneu.taCareca}
    """.trimMargin()
    )
}

// O conceito é só o seguinte
//Vc pode montar objetos mais complexos usando outros objetos pra compor ele
//E isso pode ter várias camadas se vc acha q precisa
//Tipo,
//Um objeto dentro de um outro objeto dentro de mais outro objeto
// Vc tb poderia ter uma abstração Carro onde as outras classes aí seriam filhas dela.