//Uma coleção é um conjunto de elementos

//List

fun main() {
    //Uma coleção é um conjunto de elementos

   // val list1: List<Any> = listOf(false, true, "dfu", 123) //não recomendado
   val list1: List<Int> = listOf(1, 2, 3, 4, 5)
   val list2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5) //mutable permite a gente mudar a lista

   println(list2[0])
   println(list2.size)

   //list1.add(8) //não consigo porque a lista é imutável, ela não carrega a propriedade mutableListOf

   list2.add(8)
   list2.add(10)
   list2.remove(9) //remove elemento 8
   list2.removeAt(0) //remove posição 0

   println(list2.contains(1)) //contém esse elemento? caso tenha true, caso não tenha false
   list2.clear() //limpa lista

   println(list2)

}