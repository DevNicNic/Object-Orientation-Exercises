package exerciciosAleatorios

fun main() {
    val atletaCorrendo = Atleta(taCorrendo = true)
    val atletaCaminhando = Atleta(taCorrendo = false)

    atletaCorrendo.mover()
    atletaCaminhando.mover()
}