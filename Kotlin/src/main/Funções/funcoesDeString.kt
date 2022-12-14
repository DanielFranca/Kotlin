fun main() {
    val str = "Programação Kotlin"

    println("Tamanho da String ${str.length}") 

    println("Posição (index) 0 da String: ${str[0]}")
    println(str.startsWith("Pro")) //Começa com "PRO?" return true or false
    println(str.endsWith("abc")) // termina com "ABC"? return true or false
    println(str.substring(2, 4)) // pega a partir da posição 3 até 4 nesse caso, ignora 2
    println(str.replace("Kotlin", "Kotlin é show!")) // substitui uma string antiga por uma nova
    println(str.lowercase()) //converte tudo para minúsculo
    println(str.uppercase()) // converte tudo para maiúsculo

   println( "MEU NOME É DANIEL".trim()) //Elimina espaços em branco no meio da String





}