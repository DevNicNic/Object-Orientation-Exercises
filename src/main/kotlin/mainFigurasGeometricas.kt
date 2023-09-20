fun main() {
    val fazendoCalculosRetangulo = RetanguloNovo(
        comprimento = 29.7,
        largura = 21.0
    )
    println("Calculando a Área de um retangulo... ")
    println("MEDIDAS")
    println("Comprimento: ${fazendoCalculosRetangulo.comprimento}")
    println("Largura: ${fazendoCalculosRetangulo.largura}")
    println("A àrea do retangulo é ${fazendoCalculosRetangulo.calcularArea()}")
    println()
    println("Calculando o perimetro do retangulo...")
    println("De acordo com as medidas o perimetro do retangulo é : ${fazendoCalculosRetangulo.calcularPerimetro()} ")
    println()

    val fazendoCalculosTriangulo = Triangulo(
        base = 5.0,
        altura1 = 10.0,
        altura2 = 10.0
    )
    println("Calculando a área de um triangulo...")
    println("MEDIDAS")
    println("Base: ${fazendoCalculosTriangulo.base}")
    println("Altura: ${fazendoCalculosTriangulo.altura1}")
    println("A àrea do triangulo é ${fazendoCalculosTriangulo.calcularArea()}")
    println()
    println("Calculando o perimetro do triangulo...")
    println("MEDIDAS")
    println("Base: ${fazendoCalculosTriangulo.base}")
    println("Altura1: ${fazendoCalculosTriangulo.altura1}")
    println("Altura2: ${fazendoCalculosTriangulo.altura2}")
    println("O perimetro do triangulo é : ${fazendoCalculosTriangulo.calcularPerimetro()}")
    println()

    val fazendoCalculosCirculo = Circulo(
        raio = 5.0
    )

    println("Calculando a área de um circulo...")
    println("MEDIDA")
    println("Raio: ${fazendoCalculosCirculo.raio}")
    println("A àrea do circulo é ${fazendoCalculosCirculo.calcularArea()}")
    println()
    println("Calculando o perimetro do Circulo...")
    println("O perimetro do Circulo de acordo com a medida  é : ${fazendoCalculosCirculo.calcularPerimetro()}")

}