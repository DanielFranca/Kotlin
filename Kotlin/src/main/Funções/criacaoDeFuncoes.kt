fun main(){
    OlaMundo()
    
    println("A soma de 10 e 5 é: ${sum(10, 6)}")

}

fun OlaMundo(){ // funcão sem parâmetro
    println("Olá mundo")
}

fun sum(a: Int, b: Int): Int{ 
    val c = a + b
    return c
}