fun main(){
    helloWorld()
    
    println("A soma de 10 e 5 é: ${sum(10, 6)}")

}

fun helloWorld(){ // funcão sem parâmetro
    println("Olá mundo")
}

fun sum(a: Int, b: Int): Int{ 
    val c = a + b
    return c
}