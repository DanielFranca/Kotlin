open class Eletronico3(var marca: String){
    private fun corrente(ativo: Boolean){}
        fun ligar(){
            corrente(true)
        }
        open fun desligar(){
            corrente(false)
        }
}

class Computador3(marca: String) : Eletronico3(marca){
   
    override fun desligar(){ //sobrescrita
        save()
        super.desligar()
    }

    fun save(){}
    fun save(a: Int) {}
    fun save(a: Int, b: Int){}
    fun save(a: Float) {}
    fun save(a: Double){} 
}

fun main(){
    val c: Computador3 = Computador3("Lenovo")

    c.ligar()
    c.desligar()

}