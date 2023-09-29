package modeloAulaAlura

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
) {
    override fun bonificacao(): Double {
        return  salario
    }




}