package exerciciosAleatorios

class Circulo (
    val raio : Double
) : FiguraGeometrica(){
    override fun calcularArea(): Double {
        val calculandoArea = Math.PI * raio * raio
        return calculandoArea
    }

    override fun calcularPerimetro(): Double {
        val calculandoPerimetro = 2 * Math.PI * raio
        return calculandoPerimetro
    }
}