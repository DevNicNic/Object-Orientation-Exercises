open class Personagem (
    val nomePersonagem : String,
    var vida : Int
) {
   open fun atacar (alvo: Personagem) {
       println("$nomePersonagem ataca ${alvo.nomePersonagem}")

   }
    open fun defender (){
        println("$nomePersonagem se defende.")

    }
}