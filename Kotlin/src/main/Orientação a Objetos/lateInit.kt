class Receita {
    lateinit var instrucoes: String 

    fun geraReceita(){
        instrucoes = "lave as mãos"
    }

    fun imprimeReceita(){
        if(!this::instrucoes.isInitialized){ //verifico se minhas variavel instrucoes foi inicializada, se foi executa a linha abaixo
            instrucoes = "lave as mãos "
        }
    }

}

fun main(){
    var r: Receita = Receita()
    r.geraReceita()
    println(r.instrucoes)

    
}