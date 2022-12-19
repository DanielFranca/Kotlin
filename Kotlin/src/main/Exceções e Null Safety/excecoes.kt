fun main(){

    try{
        val s: String? = null
        val a: 10/0
        println(s!!.length) 
    }catch (e: NullPointerException) {
        println("Variável Nula")
    }catch (e: ArithmeticException) { //podemos usar mais de um catch
        println("Impossível  dividir por zero") 
    } catch (e: Exception){
        println("Genérica")
    }
     finally { //opcional
        println("Finally!")
    }
    
    println("Fim!")

    // Conseguimos saber o tipo da exceção executando o código, e observando o erro
    /*
    Exemplo

     try{
        val s: String? = null
        val a: 10/0 
        println(s!!.length) 
    }catch (e: NullPointerException) {
        println("Variável Nula")
    }
    
    println("Fim!")


    ---- Na constante a, temos uma operacao dada por 10/0, onde ocorre um erro lógico, quando executamos o kotlin nos entrega
    o tipo de erro, e o tipo de exceção que podemos tratar, nesse caso é a "ArithmeticException"

    Logo se colocarmos esse tipo de exceção no catch, conseguimos tratar ele, sem que retorne novamente um erro!
    
    */
}