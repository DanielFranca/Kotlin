fun main(){

    //chave ->  valor

    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "Berlim"))
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "Berlim"))

    println(map1)
    println(map1.entries) //imprime todas as chaves
    println(map1.values) //imprime todos os valores

    //map1["Brasil"] = "Brasília" = imutável
    map2["Brasil"] = "Brasília"
    println(map2)

    map2.remove("Brasil")
    map2.contains("Brasil")
    map2.clear()

}