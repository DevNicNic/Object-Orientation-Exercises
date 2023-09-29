package modeloAulaAlura


abstract class ContaTransferivel(
    titular: String,
    numero: Int
) : ContaBancaria(
    titular = titular,
    numero = numero
){

     fun transfere(valor: Double, destino: ContaBancaria): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}