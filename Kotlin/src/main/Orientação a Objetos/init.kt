class Animal(var especie: String){

    var fala: String = ""
    init { //executado quando a classe é instanciada
        if(especie == "cachorro"){
            fala = "eu"
        }else if(especie == "gato"){
            fala = "miau"
        } else {
            ""
        }
    }

    fun falar(){
        println(fala)
    }
}


fun main(){
   Animal("cachorro"). falar()
   
   
}