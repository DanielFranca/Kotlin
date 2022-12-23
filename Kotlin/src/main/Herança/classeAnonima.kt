interface Event{
    fun onSucess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrindo Conexões")
        println("Salvando Valores")
        println("Sucesso. Conexões fechadas")
        e.onSucess()
    }
}


fun main() {
    val p = Programa()
    p.salvar(object : Event {
        override fun onSucccess() {
            print("onsucess")
        }
    })
}