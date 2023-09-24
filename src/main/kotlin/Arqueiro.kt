class Arqueiro(
    nomePersonagem : String,
    vida : Int
): Personagem(
    nomePersonagem = nomePersonagem,
    vida = vida
) {
    override fun atacar(alvo: Personagem) {
        println("$nomePersonagem realiza um ataque de Arco e Flechas contra ${alvo.nomePersonagem}")
    }

    override fun defender() {
        println("$nomePersonagem se defende com seu seu escudo mágico.")
    }

    fun danos() {
        val dano = 11
        val danoLevado = vida - dano
        println("$nomePersonagem sofreu dano ${dano}, e ficou com ${danoLevado} vidas. ")

    }
}