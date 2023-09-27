package arquivosDeUmaPagina

fun main() {
    //when para comprar igualdade
//usar o parenteses no when só é possivel quando vc quer comparar se a variavel que
//esta entre parenteses é igual a um dos valores de when.
    val escolhaDoUsuario = 1 // to assumindo que o usuario digitou 1 mas poderia ser o readLine

    /**
     * Na linha 19 vc esta dizendo para o programa :
     * eu quero que vc atribua a variavel oQueVcPrecisaImprimir o resultado  do meu when
     * e o meu when vai verificar se a escolhaDoUsuario é IGUAL a agum número abaixo
     * 1,2, 1 se não for nenhum desses números então vai cair no else
     *
     * Ex: se o usuario digitou 1 o when vai perguntar na ordem
     * escolhaDoUsuario é igual a 1?
     * escolhaDoUsuario é igual a 2?
     * escolhaDoUsuario é igual a 3?
     * escolhaDoUsuario não é 1 nem 2 nem 3 então cai no else.
     */

    val oQueVcPrecisaImprimir = when (escolhaDoUsuario){
        1 -> "Você digitou 1"
        2 -> "Você digitou 2"
        3 -> "Você digitou 3"
        else -> "As variaveis são diferentes das condições propostas"

    }
//nesse momento , algo ja vai ter sido atribuido a variavel oQueVcPrecisaImprimir
//alguma das opções do when
// crtl + alt +L organiza o codigo

    println(oQueVcPrecisaImprimir)
}
