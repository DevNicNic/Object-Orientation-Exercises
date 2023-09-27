package arquivosAulaAlura

class Diretor(
    nome1: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr : Double //participação de lucros

) : FuncionarioAdmin(
    nome1 = nome1,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override fun bonificacao(): Double {
        return  salario + plr
    }

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }


}