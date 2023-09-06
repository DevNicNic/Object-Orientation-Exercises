fun main() {
val meuCarro = OutroCarro(marca= "Toyota", modelo= "1.6", ano= 2020)
    meuCarro.exibirDetalhes(marca = "Toyota")
    meuCarro.exibirDetalhes(marca= "Toyota", modelo= "1.6")
    meuCarro.exibirDetalhes(marca= "Toyota", modelo= "1.6", ano = 2020)
}
class OutroCarro(
    val marca : String,
    val modelo: String,
    val ano: Int ) {

    fun exibirDetalhes (marca: String){
        println("Marca: $marca")
    }

    fun exibirDetalhes ( marca: String, modelo: String){
        println("Marca: $marca \nModelo: $modelo ")
    }

    fun exibirDetalhes ( marca: String, modelo: String, ano: Int){
        println("Marca: $marca \nModelo: $modelo \nAno : $ano")
    }

}