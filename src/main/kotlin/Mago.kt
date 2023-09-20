class Mago(
    nomePersonagem : String,
    vida : Int
): Personagem(
    nomePersonagem = nomePersonagem,
    vida = vida
) {
    override fun atacar(alvo: Personagem) {
        super.atacar(alvo)
    }

    override fun defender() {
        super.defender()
    }
}