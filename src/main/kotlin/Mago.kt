class Mago(
    nomePersonagem : String,
    vida : Int
): Personagem(
    nomePersonagem = nomePersonagem,
    vida = vida
) {
    override fun atacar(alvo: Personagem) {
        println("$nomePersonagem realiza um ataque de magia contra ${alvo.nomePersonagem}")
    }

    override fun defender() {
        println("$nomePersonagem se defende com sua capa protetora invisivel e blindada.")
    }
    fun danos (){
        val dano = 10
        val danoLevado =  vida - dano
        println("$nomePersonagem sofreu dano ${dano}, e ficou com ${danoLevado} vidas. ")

    }
}