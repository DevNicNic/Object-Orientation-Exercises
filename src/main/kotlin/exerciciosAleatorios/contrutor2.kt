package exerciciosAleatorios

fun main() {
    val dadosPessoais = Pessoa(nome= "Nicole", outraIdade = 37)
    dadosPessoais.apresentar (nome = "Nicole")
    dadosPessoais.apresentar(nome= "Nicole", outraIdade = 37)

}
class Pessoa (
    val nome: String,
    val outraIdade: Int){

    fun apresentar (nome: String){
        println("Ola $nome, seja bem vindo!")
    }
    fun apresentar (nome: String, outraIdade: Int){
        println("Ola $nome vc tem $outraIdade anos.")
    }

}