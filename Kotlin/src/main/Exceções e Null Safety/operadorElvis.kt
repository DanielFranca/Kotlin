fun main(){
    val str: String? = null
    
    if(str == null) {
        println("nulo")
    } else {
        println(str)
    }

    //ou c/ operador lógico elvis
    println(str ?: "nulo") // o nosso operador elvis verifica se a nossa variável é nula se for ele retorna uma função ou uma mensagem

    //estudando, observei que não existe realmente operador ternário no kotlin, porque existem funcionalidades estudadas anteriormente que já suprem isso 

    //exemplo

    val idade = 18
    val str2 = if (idade > 18) "Maior de idade" else "Menor de idade"
}