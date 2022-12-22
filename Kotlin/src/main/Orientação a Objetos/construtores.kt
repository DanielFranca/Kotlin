class Pessoa2 (val anoNascimento: Int, var nome: String){

    //existe o construtor primário que é gerado pela classe para conseguirmos instanciar normalment, e o secundário que veremos abaixo

    var doc: String? = null

    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome) {
        //construtor secundário
        //não podemos usar var ou val no construtor secundário
        //criando um construtor secundário conseguimos passar mais parâmetros dentro da classe
        this.doc = doc //usa o this para referenciar a variável da classe, não do construtor

    }

    
    fun dormir(){

    }

    fun acordar(){

    }
}


fun main() {

   //  Nothing() não consigo instancia porque privei a class "Vazia"

    // class - comportamentos e atributos 
    // classe (instancia) objetos

    // this - se refere ao objeto
    var pessoa: Pessoa2 = Pessoa2(2004, "Daniel", "13456789")


    
    pessoa.nome
    pessoa.acordar()
    pessoa.dormir()

    throw Exception()
    Exception("Mensagem de erro")
    
    

} 