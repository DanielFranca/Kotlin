fun main(){
    println(media2(false, 1f, 2f, 3f, 5.76f, 8f, "", false ))

    //exemplo real do uso de generics
    arrayOf(2, 2, 3, 6, 6, 4f, false)
    "skkskkdd".startsWith("sd")
}

//Generics
//Permite a chamada da função com quantos tipos de dados a gente quiser
//Uso de T como padrão, para definir o generics
//Para nos previnir de executar parâmetro que não convém an nossa função, fazemos verficações se o parâmetro que veio é o tipo esperado
fun <T, J> media2(abc: J, vararg notas: T): Float {
    var soma = 0f
    for(n in notas) {
        if(n is Float){
            soma += n 
        }  
    }

    return (soma / notas.size)
}
