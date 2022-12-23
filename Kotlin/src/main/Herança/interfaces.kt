Interface Selvagem {
    fun atacar()
}



abstract class Mamifero2(val nome: String)  {
    fun acordar(){
        println("Acordei")
    }
    fun dormir(){
        println("dormi")
    }

    abstract fun falar()
        //classe abstrata = função abstratra
        //uma classe abstrata nunca pode ser instanciada
    
}

class Cachorro2(nome: String) : Mamifero(nome), Selvagem  {
    override fun falar() { 
    }

    override fun atacar(){
        TODO("Not yet implemented")
    }
}

fun main(){
    //val m = Mamifero()
    //val s = Selvagem()

}
