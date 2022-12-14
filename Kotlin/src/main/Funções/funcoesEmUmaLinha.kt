fun main(){
    
    helloWorld2()
    println("A soma de 10 e 5 é: ${sum2(10, 6)}")
    divisao(10f, 3.5f)

}


fun sum2(a: Int, b: Int) = (a + b) //função com parâmetro em uma linha

fun helloWorld2() = println("Hello, world") // função sem parâmetro em uma linha

fun divisao(a: Float, b: Float): Float = a / b // função com parâmetro com tipo de retorno, pode ser sem o tipo de retorno também!!
