package exerciciosAleatorios

class Atleta(
    val taCorrendo: Boolean

) : Andavel, Corrivel {
    val caminhada = Andar()
    val corrida = Correr()

    override fun mover() {
        if (taCorrendo) {
            corrida.mover()

        } else {
            caminhada.mover()


        }

    }
}

