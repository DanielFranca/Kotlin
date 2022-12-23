class Matematica {
    companion object { //só pode definir um na classe; pode ou não ser nomeado;
        val PI = 3.1415
        fun teste(){}
        init{
            println("Fui inicializado")
        }
    }

    object obj1{
        //obrigatório ter nome
        val PI = 3.1415
        fun teste(){}
    }
    object obj2 {
        val PI = 3.1415
        fun teste(){}
        init{
            println("Fui inicializado")
        }
    }
}


fun main(){
    Matematica.PI //companion object
    Matematica.teste() //companion object

    Matematica.obj1.PI
    Matematica.obj2.PI

    val m = Matematica()
    
}