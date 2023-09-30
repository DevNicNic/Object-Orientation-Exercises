package exerciciosAleatorios

class RetanguloNovo(
    val comprimento: Double,
    val largura : Double
) : FiguraGeometrica(){
    override fun calcularArea(): Double {
        val calculandoArea = comprimento * largura
        return calculandoArea
    }

    override fun calcularPerimetro(): Double {
        val calculandoPerimetro = (comprimento + largura) * 2
        return calculandoPerimetro
    }
}