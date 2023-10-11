package exerciciosAleatorios

class Automovel(

) : Dirigivel, Estacionavel {

    override fun dirigir (){
        println("O Carro esta em movimento.")
    }

    override fun estacionando() {
        println("O Carro esta estacionado.")
    }

}


