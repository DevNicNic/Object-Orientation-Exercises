class Diretor(
    nome1: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr : Double //participação de lucros

) : Funcionario(
    nome1 = nome1,
    cpf = cpf,
    salario = salario
){
    override fun bonificacao(): Double {
        return super.bonificacao() + salario + plr
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false

    }
}