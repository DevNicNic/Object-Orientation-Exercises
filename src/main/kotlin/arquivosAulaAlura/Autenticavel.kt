package arquivosAulaAlura

interface Autenticavel {

     val senha: Int

     fun autentica(senha: Int): Boolean {
          println("AutenticaInterface")
          if (this.senha == senha) {
               return true
          }
          return false

     }
}