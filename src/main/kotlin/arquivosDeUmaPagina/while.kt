package arquivosDeUmaPagina

fun main() {
    var listaCompras = arrayOf("Arroz", "Feijão", "Uva",  "Batata","Banana",  "Carne", "Leite", "Ovos", "Frango")

    var indice = 0
// estrutura de repetição enquanto , enquanto a condicao for verdadeira ele vai imprimir o print
   // while (indice <= 8){
   //     println(listaCompras[indice])
   //     indice++
    //}
    while(indice <= listaCompras.size-1){ // o size adiciona mais um a contagem da lista por isso temos que colocar - 1 pra dar certo
        println(listaCompras[indice])
        indice++
    }

}