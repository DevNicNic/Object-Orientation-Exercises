fun main() {
    println("BEM VINDO AO NICOLE BANK")
    println()



}



fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor

}

    class Conta {
        var titular = ""
        var numero = 0
        var saldo = 0.0
    }






