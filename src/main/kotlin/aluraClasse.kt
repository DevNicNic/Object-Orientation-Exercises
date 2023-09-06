fun main() {
    println("Bem vindo ao Bytebank!!")
    val contaAlex = ContaBancaria(titular = "Alex", numero= 1000)
    contaAlex.deposita(200.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println()
    val contaFran = ContaBancaria(titular = "Fran",numero = 1001)
    contaFran.deposita(300.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()


    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)
    println()
    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)
    println()

    println("Sacando da Conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)
    println()
    println("Sacando da Conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)
    println()
    println("Saque em exesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)
    println()
    println("Saque em exesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)
    println()
    println("Transferência da conta da Fran para o Alex")

    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)

}

//contrutor primario é o mais bem vindo
class ContaBancaria(
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

    fun saca(valor: Double) {
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


fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val contaJoao = ContaBancaria(titular = "Joao", numero = 1002) //cada conta deve ter seu objeto, por ser um espaço separado na memoria ou seja uma referencia
    var contaMaria = ContaBancaria(titular = "Maria", numero = 1002)



    println("titular conta joao : ${contaJoao.titular}")
    println("titular conta maria : ${contaMaria.titular}")

    println(contaMaria)
    println(contaJoao)

}
