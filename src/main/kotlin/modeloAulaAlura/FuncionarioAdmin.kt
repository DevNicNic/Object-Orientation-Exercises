package modeloAulaAlura

abstract class FuncionarioAdmin(
    nome1: String,
    cpf: String,
    salario: Double,
    protected val senha: Int

) : Funcionario(
    nome1 = nome1,
    cpf = cpf,
    salario = salario
), Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false

    }


}