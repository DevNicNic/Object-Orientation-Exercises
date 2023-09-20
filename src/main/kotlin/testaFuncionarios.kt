fun testaFuncionarios() {
    println("Bem vindo ao Bytebank!!")

    val alex = Funcionario(
        nome1 = "Alex",
        cpf = "111.111.111-1",
        salario = 1000.0


    )
    println("Nome :  ${alex.nome1}")
    println("CPF :  ${alex.cpf}")
    println("Salario : ${alex.salario}")
    println("Bonificação : ${alex.bonificacao()}")
    println()

    val fran = Gerente(
        nome1 = "Fran",
        cpf = "222.222.22",
        salario = 2000.0,
        senha = 1234
    )
    println("Nome :  ${fran.nome1}")
    println("CPF :  ${fran.cpf}")
    println("Salario : ${fran.salario}")
    println("Bonificação : ${fran.bonificacao()}")
    println()

    if (fran.autentica(senha = 1234)) {
        println("Autenticação bem sucedida")
    } else {
        println("Falha na autenticação")
    }

    val gui = Diretor(
        nome1 = "Gui",
        cpf = "333.333.333.33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("Nome: ${gui.nome1}")
    println("CPF: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao()}")
    println("PLR : ${gui.plr} ")
    println()

    if (gui.autentica(senha = 4000)) {
        println("Autenticação bem sucedida")
    } else {
        println("Falha na autenticação")
    }
    println()

    val maria = Analista(
        nome1 = "Maria",
        cpf = "4444.4444.444-44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de Bonificação : ${calculadora.total}")
}