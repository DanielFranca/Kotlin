fun main() {
    var s: String? = null //kotlin aceita o valor nulo quando eu insiro um modificador no tipo da variável = ?

    //lógico
    println(s?.length) // tratamos o retorno dessa string inserindo o modificador no println também..
    println(s!!.length) //Quando temos certeza que a variável não é nula, pedimos para que o kotlin não trate, caso ela for nula o kotlin retorna o erro de NullPointer

    //exemplo
    var abc = readLine()
    println(abc?.length)
    

}