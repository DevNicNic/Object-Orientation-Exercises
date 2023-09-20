class Analista(
    nome1: String,
    cpf: String,
    salario: Double,


) : Funcionario(
    nome1 = nome1,
    cpf = cpf,
    salario = salario
){
    override fun bonificacao(): Double {
        return super.bonificacao() + salario * 0.1
    }


}