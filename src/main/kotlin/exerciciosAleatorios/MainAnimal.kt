package exerciciosAleatorios

fun main() {
    val cachorroLate = CachorroDoZeca(
        nomeAnimal = "Cachorro"
    )
    println("Nome do animal: ${cachorroLate.nomeAnimal}")
    cachorroLate.fazerSom()
    println()

    val gatoMia = GatoNic (
        nomeAnimal = "Gato"
    )
    println("Nome do animal: ${gatoMia.nomeAnimal}")
    gatoMia.fazerSom()
    println()

    val passaroNic = PassaroNic(
        nomeAnimal = "Passarinho"
    )
    println("Nome do animal: ${passaroNic.nomeAnimal} ")
    passaroNic.fazerSom()


}