import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Digite um número: ")
    val a = reader.nextInt()
    println("Digite outro número: ")
    val b = reader.nextInt()
    println(
        "Escolha uma das opções: " +
                "\n[1] PARA SOMA" +
                "\n[2] PARA SUBTRAÇÃO" +
                "\n[3] PARA MULTIPLICAÇÃO" +
                "\n[4] PARA DIVISÃO "
    )
    val opcao = reader.nextInt()

    when (opcao) {
        1 -> {
            print("Vc escolheu a soma portanto $a + $b = ")
            print(somar(a,b))
        }
        2 -> {
            print("Vc escolheu a subtração portanto $a - $b = ")
            print(subtrair(a, b))
        }
        3 -> {
            print("Vc eacolheu a multiplicação portanto $a x $b = ")
            print(multiplicar(a, b))
        }
        4 -> {
            print("Vc escolheu a divisão portanto $a : $b = ")
            print(dividir(a, b))
        }
        else -> {
            println("Opção invalida tente outra vez...")
        }
    }

}

fun somar ( a: Int , b: Int): Int{
    val resultado = a + b
    return resultado
}
fun subtrair (a: Int, b: Int): Int{
    val resultado = a - b
    return resultado
}
fun multiplicar (a: Int, b: Int): Int{
    val resultado = a * b
    return resultado
}
fun dividir (a: Int, b: Int): Int {
    val resultado = a / b
    return resultado
}



