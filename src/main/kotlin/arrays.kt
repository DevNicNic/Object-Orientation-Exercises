import java.util.Arrays

fun main() {
    var listaCompras = arrayOf("Arroz", "Feijão", "Uva",  "Batata","Banana",  "Carne", "Leite", "Ovos", "Frango")
    var listaNumeros = arrayOf (10, 20, 30, 40, 50) // no kolin podemos fazer uma lista de numeros ou texto
    println(listaCompras[2]) // o numero é o indice onde se encontra o item na lista
    println(Arrays.toString(listaCompras)) // Arrays.toString mostra a lista toda no print
    println(listaCompras.size)   //mostra quantos itens tem na lista
    println(listaNumeros[2])

}