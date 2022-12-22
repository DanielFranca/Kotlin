
//com o modificador private limito a visibilidade dessa classe somente a esse arquivo, ou seja não pode ser acessada publicamente
// e nem pode ser herdada;

//protected dá acesso a sua classe e a classes que herdam 
private class aquiClassePrivada 



open class Eletronico2(private var marca: String) { //precisamos colocar o open para que outras classes consigam herdar o comportamento dessa classe

    private fun ativarCorrente(s: String){} 
    //dessa forma não consigo usar o ativar corrente publicamente
    fun ligar() {
        ativarCorrente("s")
    }
    fun desligar()  {}
    aquiClassePrivada() //não consigo usar porque está com modificador Private
}

class Computador2( marca: String) : Eletronico2(marca) {
   fun instalarSoftware() {}
   fun processar() {}
}

fun main(){
    var c: Computador2 = Computador2("DELL")

    
    c.ligar()
    c.desligar() 
    //c.marca não consigo usar porque a marca está com modificado private na classe Eletronico 2
    

}