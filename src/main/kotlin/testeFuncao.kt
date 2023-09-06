//fun saudacao(): Unit {
//    println("Ola Mundo!")
//
//}
//fun main () {
//    val resultado = saudacao() // Aqui o resultado é do tipo Unit
//    println(resultado) //isso vai imprimir "Kotlin.Unit"
//}

//fun saudacaoMatinal (): Unit {
//    println("BOM DIA!")
//}
//
//fun main () {
//    val resultado = saudacaoMatinal()
//    println(resultado)
//}

//fun despedidaNoturna (): Unit {
//    println("BOA NOITE!")
//}
//
//fun main (){
//    despedidaNoturna()
//}


//fun linhaPontilhada () : Unit {
//    println(".".repeat(20))
//}
//
//fun main () {
//    linhaPontilhada()
//}

//fun aviso () : Unit {
//    println("Cuidado Piso Molhado!")
//}
//
//fun main (){
//    aviso()
//}

//fun saudacaoPersonalizada () : Unit {
//    println("Ola Nicole!!!Seja Bem Vinda!")
//}
//fun main () {
//    saudacaoPersonalizada()
//}

//fun somar (a : Int, b : Int): Int {
//    val resultado = a + b
//    return resultado
//}
//fun main (){
//    val numero1= 5
//    val numero2= 10
//    val resultado = somar(numero1, numero2)
//    println(resultado)
//}



fun cumprimentandoUsuario (nome : String): String {
    return "Ola! $nome Seja Bem Vindo (a)"


}

fun main (){
    val nomeUsuario = "Nicole"
    println(cumprimentandoUsuario(nomeUsuario))
}
