package exerciciosAleatorios

fun main() {
    val meuLivro = Livro()
    meuLivro.titulo = "Minha Vida de Programadora"
    meuLivro.autor = "Nicole Moraes"
    meuLivro.anoDePublicacao = 2023

    println(meuLivro.titulo)
    println(meuLivro.autor)
    println(meuLivro.anoDePublicacao)
    meuLivro.ler()
    println()

    val outroLivro = Livro()
    outroLivro.titulo = "Quando eu Ficar Rica"
    outroLivro.autor = "NIcNIcMOraes"
    outroLivro.anoDePublicacao = 2023

    println(outroLivro.titulo)
    println(outroLivro.autor)
    println(outroLivro.anoDePublicacao)
    outroLivro.ler()

}

class Livro {
    var titulo = ""
    var autor = ""
    var anoDePublicacao = 0

    fun ler() {
        println("Lendo o livro, $titulo de $autor .")
    }
}