import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Quantos anos você tem ? ")
    val idadeUsuario = reader.nextInt()
    val verificandoIdadeUsuario = verificarMaiorIdade(idadeUsuario)
    println(verificandoIdadeUsuario)
}


fun verificarMaiorIdade (idade: Int) : String {
    if(idade >= 18){
        return "Você é maior de idade..."
    } else {
        return "Você ainda não atingiu a maioridade..."
    }
}