import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Qual a distância da sua viagem em Km : ")
    val distancia = reader.nextInt()
    val total1 = distancia * 0.50
    val total2 = distancia * 0.45
    val totalPagar = when {
        distancia <= 200 -> "A distancia da sua viagem sera de $distancia km e o total a ser pago sera R$ $total1"
        distancia > 200 -> " A distancia da sua viagem sera de $distancia Km e o total a ser pago sera de R$ $total2"
        else -> "Tenha uma boa viagem "
    }

    println(totalPagar)
}