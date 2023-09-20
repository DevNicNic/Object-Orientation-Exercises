class Guerreiro(
    nomePersonagem: String,
    vida: Int
) : Personagem(
    nomePersonagem = nomePersonagem,
    vida = vida
) {
    override fun atacar(alvo: Personagem) {
        println("$nomePersonagem realiza um ataque físico contra ${alvo.nomePersonagem}")
        val dano = 10
        val danoLevado =  vida - dano
        println("O restante de vidas para $nomePersonagem é de $danoLevado")
        super.atacar(alvo)
    }

    override fun defender() {
        println("$nomePersonagem se defende com seu escudo.")
        super.defender()
    }

}
