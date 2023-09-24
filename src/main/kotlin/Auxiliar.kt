class Auxiliar(
    nome1: String,
    cpf: String,
    salario: Double,


) : Funcionario(
    nome1 = nome1,
    cpf = cpf,
    salario = salario
){
    override fun bonificacao(): Double {
        return salario * 0.05
    }


}