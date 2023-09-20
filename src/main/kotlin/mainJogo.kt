fun main() {
    val jogaGuerreiro = Guerreiro(
        nomePersonagem = "Guerreiro",
        vida = 10
    )

    val jogaMago = Mago (
        nomePersonagem = "Mago",
        vida = 1
    )

    val jogaArqueiro = Arqueiro(
        nomePersonagem = "Arqueiro",
        vida = 1
    )
    jogaGuerreiro.atacar(alvo = jogaMago )


}