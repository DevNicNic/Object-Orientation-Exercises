fun main() {
    val jogaGuerreiro = Guerreiro(
        nomePersonagem = "Guerreiro",
        vida = 15
    )

    val jogaMago = Mago (
        nomePersonagem = "Mago",
        vida = 10
    )

    val jogaArqueiro = Arqueiro(
        nomePersonagem = "Arqueiro",
        vida = 12
    )
    jogaGuerreiro.atacar(alvo = jogaMago )
    jogaMago.defender()
    jogaMago.danos()
    println()
    jogaMago.atacar(alvo = jogaArqueiro)
    jogaArqueiro.defender()
    jogaArqueiro.danos()
    println()
    jogaArqueiro.atacar(alvo = jogaGuerreiro)
    jogaGuerreiro.defender()
    jogaGuerreiro.danos()



}