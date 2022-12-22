open class Eletronico3(var marca: String){
    private fun corrente(ativo: Boolean){}
        fun ligar(){
            corrente(true)
        }
        fun desligar(){
            corrente(false)
        }
}

class Computador3(marca: String) : Eletronico3(marca){
    fun save(){}
}

fun main(){
    val c: Computador3 = Computador3("Lenovo")

    c.ligar()
    c.desligar()

}