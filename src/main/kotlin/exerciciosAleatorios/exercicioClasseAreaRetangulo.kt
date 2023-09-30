package exerciciosAleatorios

fun main() {
    val areaRetangulo = Retangulo()
    areaRetangulo.altura = 5.0
    areaRetangulo.base = 10.0
    println("Altura: ${areaRetangulo.altura}")
    println("Base: ${areaRetangulo.base}")
    println("A Área do retangulo : ${areaRetangulo.calcularArea()}")
}
class Retangulo{
    var base = 0.0
    var altura = 0.0

    fun calcularArea(): Double{
        return base * altura
    }
}