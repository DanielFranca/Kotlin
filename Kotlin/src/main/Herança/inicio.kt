
open class Eletronico(var marca: String) { //precisamos colocar o open para que outras classes consigam herdar o comportamento dessa classe
    fun ligar() {}
    fun desligar()  {}
}

class Computador( marca: String) : Eletronico(marca) {
   fun instalarSoftware() {}
   fun processar() {}
}

fun main(){
    var c: Computador = Computador("DELL")

    c.ligar()
    c.desligar() 
    c.marca

}