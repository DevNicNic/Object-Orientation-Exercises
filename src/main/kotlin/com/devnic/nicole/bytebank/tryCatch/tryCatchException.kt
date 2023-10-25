package com.devnic.nicole.bytebank.tryCatch

fun main() {
    val textoPraImprimir = try {
        if (funcaoPerigosa() != 100) throw NumeroIncorretoException()
        else funcaoPerigosa()
    } catch (e: NumeroIncorretoException){
        "Você precisa digitar o número 100. ${e.message}"
    }

    println(textoPraImprimir)
}

fun funcaoPerigosa (): Int {
    //se minha fun não retorna nenhum erro, mas eu gostaria que ela retornasse, posso criar minha propria exception
    // Ex: Por algum motivo você precisa que essa função retorne,100 e se ela retornar 200 , queremos
    // lançar uma exeção. Por que isso não deveria ocorrer
    val num = 200
    return num
}
//podemos tb adicionar um código de erro ou mensagem pra identificar o erro .
//Lembre que um aplicativo pode ter milhões de linhas, o código ou mensagem, ajuda a identificar onde exatamente
//ocorreu o erro.
class NumeroIncorretoException : Exception ("\n \nErro de código 1000 ao tentar recuperar o número 100")

//O que eu entendi disso tudo ...
//Dentro do bloco try vai uma ação ou função ou qualquer coisa que possa dar um problema um erro
//ou uma exception.
//Se o que estiver dentro do try der erro então ele vai para o catch, e executa o q esta dentro do catch
//Dentro do catch vai ter uma mensagem respeitosa avisando nosso usuário do que ele fez errado e ele assim pode tentar outra vez.
//Se não der erro o try vai executar o que estiver dentro dele normalmente .

//O try-Catch pode nos retornar um valo, por isso ele pode ser atribuido a um val.
//No caso do exemplo nós atribuimos o try-catch a val textoPraImprimir, e dentro do try chamamos a função funcaoperigosa.
//Nessa caso do exercicio nós criamos nossa propria exception, criamos uma classe com o nome da nossa exception que deve
//pelos bons contumes ter o Exception no nome, e tb deve herdar da classe mãe Exception.
//No exemplo eu quero que o numero 100 apareça no console, então no try colocamos um if com a condição de que se o numero
//for diferente de 100 ele deve executar minha exceptiom NumeroIncorretoexception que tras com ela uma mensagem de erro .
//No catch tb tem um mensagem que diz pro usuário o que ele fez de errado para que ele possa tentar outra vez .
//Ja se o número digitado for o 100 ele não vai apresentar erro então o try vai executar a função chamada que no caso é
// a funcaoperigosa que tem a val num , e um retorno de num, que vai ser atribuido a val textoPraImprimir,
//que consequentemente vai imprimir o número 100 sem nenhum problema pra resolver .