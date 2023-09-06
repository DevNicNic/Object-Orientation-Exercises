/**
 * toda função no Kotlin tem um retorno
 * mas funçôes com retorno Unit, são o mesmo que não existir um retorno pq Unit, é o nada, tb conhecido como Void
 *
 */

fun main () {
    //chamando a função
    escrevaUmafrase()
}
/**
 * exempli de função sem retorno ou com retorno Init
 * Repare que não é necessario acrescentar o retorno dessa função (: Unit) quando não adicionamos
 * o retorno o Kotlin ja infere (Advinha) que é uma função com retorno Unit
 */

fun escrevaUmafrase() {
    print("Uma frase legal!")
}



//fun saudacao(nome: String, idade: Int): String{
//    retur "Eu me chamo $nome, e tenho $idade anos"
//}
// fun main () {
//     val saudacao = saudacao("Nicole", 37)
// }