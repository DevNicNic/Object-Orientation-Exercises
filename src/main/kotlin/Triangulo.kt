class Triangulo(
    val base: Double,
    val altura1 : Double,
    val altura2 : Double
) : FiguraGeometrica (){
    override fun calcularArea(): Double {
        val calculandoArea = (base * altura1) / 2
        return calculandoArea
    }

    override fun calcularPerimetro(): Double {
        val calculandoPerimetro = base + altura1 + altura2
        return calculandoPerimetro
    }
}