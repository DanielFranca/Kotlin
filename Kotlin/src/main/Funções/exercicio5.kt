//Escreva um programa que seja capaz de receber uma String e fazer a troca de todas as letras "a" ou "A" por "x"
 //A. não deve existir lógica dentro da função main. Deve ser usada como ponto de entrada.file
 //B. escrever uma função para a troca de letras e impressão de valor final
 //C. String final deve estar com todas as letras minúsculas.

 fun main() {
    trocaLetras()
 }

 fun trocaLetras(palavra: String = "Daniel Da Anunciacao"){

    palavra.replace("a", "x").replace("A", "x").lowercase()

    println(palavra)
 }