package arquivosAulaAlura

abstract class FuncionarioAdmin(
    nome1: String,
    cpf: String,
    salario: Double,
    val senha: Int

) : Funcionario(
    nome1 = nome1,
    cpf = cpf,
    salario = salario
) {
     open fun autentica(senha: Int): Boolean {
         println("FuncionarioAdmim")
        if (this.senha == senha) {
            return true
        }
        return false

    }


}