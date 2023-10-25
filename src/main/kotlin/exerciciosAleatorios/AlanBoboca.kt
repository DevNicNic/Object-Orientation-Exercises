package exerciciosAleatorios

class AlanBoboca (
    val bobao: String,
    val filho: String,
    val mae: String
){

}

fun main() {
    val famila = AlanBoboca (
        bobao = "Alan",
        filho = "Zeca",
        mae = "Nicole"
    )
    println("========<3 FAMILIA <3========")
    println("${famila.mae} + ${famila.bobao} = ${famila.filho}")
}