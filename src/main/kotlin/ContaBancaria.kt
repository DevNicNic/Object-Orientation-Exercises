//contrutor primario é o mais bem vindo
open class ContaBancaria(
    var titular: String,
    val numero: Int
    //val teste : int = 9 opcional nao é obrigatorio mandar no parametro na hora da construção assim o valor sera o da properteis
) {
    var saldo = 0.0
        private set

//    constructor(titular: String, numero: Int){ // construtor secundario
//        this.titular = titular
//        this.numero = numero //inicialização
//    }


    fun deposita(valor: Double) { //função membro , metodos ou comportamento da classe
        if (valor > 0) {
            this.saldo += valor
        }

    }

    open fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: ContaBancaria): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
//    fun getSaldo (): Double {
//        return saldo
//    }
//    fun setSaldo (valor: Double){
//        if (valor > 0){
//            saldo = valor
//        }
//
//
//    }
}