package arquivosAulaAlura

import arquivosAulaAlura.Funcionario

class Gerente(
    nome1: String,
    cpf: String,
    salario: Double,
    senha: Int

) : FuncionarioAdmin(
    nome1 = nome1,
    cpf = cpf,
    salario = salario,
    senha = senha
),  Autenticavel {
    override fun bonificacao(): Double {
        return  salario
    }

    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }


}