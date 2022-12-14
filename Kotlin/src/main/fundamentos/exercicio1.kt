/*
A. crie um novo arquivo com uma função Main.
B. Declare uma variável mutável capaz de armazenar seu nome completo.file
C. Declare uma variável de texto sem valor algum.
D. Declaree uma variável imutável com menor tipo de dado possível capaz de armazenar o número que você calça.
E. Declare uma variável capaz de armazenar o PIB do Brasil. (1.869.000.000.000)
F. Declare uma variável capaz de armazenar a população do Brasil. (211.000.000)
G. Imprima o valor do PIB per capita.
H. Rode seu programa de maneira que não possua erros de compilação ou execução.
*/

fun main(){

    var meuNome: String = "Daniel da Anunciação França Leite"
    var textoVazio: String = " "
    var numeroQueEuCalco: Int = 40

    val PIBdoBrasil: Long = 1869000000000
    val populacaoBrasil: Int = 211000000

    println("Meu nome: + $meuNome, \n Número que eu calço: $numeroQueEuCalco + \n Texto Vazio:  $textoVazio")

    println({calcularPiBperCapita(PIBdoBrasil, populacaoBrasil)})

}

// Aqui não era necessário criar função, mas criei para testar a criação de uma função em kotlin, e deu certo! :)

fun calcularPiBperCapita(PIBdoBrasil: Long, populacaoBrasil: Int){
    var calcular = PIBdoBrasil / populacaoBrasil

    println(calcular)

}