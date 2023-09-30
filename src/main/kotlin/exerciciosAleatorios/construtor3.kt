package exerciciosAleatorios

fun main() {
    val calculandoArea = OutroRetangulo (largura = 5.0, outraAltura = 8.0)
    calculandoArea.imprimirArea()

}
class OutroRetangulo (
    val largura: Double,
    val outraAltura: Double){

    fun imprimirArea (){
        val areaRetangulo = largura * outraAltura
       println("Area do Retangulo : $areaRetangulo ")

    }

}