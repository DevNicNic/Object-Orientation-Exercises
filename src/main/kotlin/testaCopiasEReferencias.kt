fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val contaJoao = ContaCorrente(titular = "Joao", numero = 1002) //cada conta deve ter seu objeto, por ser um espaço separado na memoria ou seja uma referencia
    var contaMaria = ContaPoupanca(titular = "Maria", numero = 1002)



    println("titular conta joao : ${contaJoao.titular}")
    println("titular conta maria : ${contaMaria.titular}")

    println(contaMaria)
    println(contaJoao)

}