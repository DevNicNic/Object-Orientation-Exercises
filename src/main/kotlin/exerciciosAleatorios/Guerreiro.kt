package exerciciosAleatorios

class Guerreiro(
    nomePersonagem: String,
    vida: Int
) : Personagem(
    nomePersonagem = nomePersonagem,
    vida = vida
) {
    override fun atacar(alvo: Personagem) {
        println("$nomePersonagem realiza um ataque físico contra ${alvo.nomePersonagem}")
    }

    override fun defender() {
        println("$nomePersonagem se defende com seu escudo.")

    }

    fun danos() {
        val dano = 8
        val danoLevado = vida - dano
        println("$nomePersonagem sofreu dano ${dano}, e ficou com ${danoLevado} vidas. ")

    }
}