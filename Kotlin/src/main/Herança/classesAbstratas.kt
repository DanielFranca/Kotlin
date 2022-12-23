abstract class Mamifero(val nome: String){
    fun acordar(){
        println("Acordei")
    }
    fun dormir(){
        println("dormir")
    }

    abstract fun falar()
        //classe abstrata = função abstratra
        //uma classe abstrata nunca pode ser instanciada
    abstract fun comer()
    
}

abstract class Cachorro(nome: String) : Mamifero(nome) {
    override fun falar() {
        
    }
}

fun main(){
    //val m = Mamifero()

}

