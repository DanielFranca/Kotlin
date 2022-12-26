
import kotlin.collections.first

fun main(){

    val data = listaDeDados2()


   println("Primeira receita: ${ data.first() }") //primeiro item do conjunto retorna o objeto inteiro
   println("Primeira receita: ${ data.last() }") //último item do conjunto retorna o objeto inteiro 
   println("Primeira receita: ${ data.first().nome }") //primeiro item do conjunto retorna só o nome
   println("Primeira receita: ${ data.last().nome }") //último item do conjunto retorna só o nome

   println(listOf<Int>().firstOrNull()) //caso não tenha nenhum elemento retorna null
   println(listOf<Int>().lastOrNull()) //caso não tenha nenhum elemento retorna null

   //sum e sumOf
   println(data.sumOf { it.calorias })//soma todas as calorias dentro do Objeto 

   //filter
   //sei fazer lasanha?
   println(data.filter { it.nome == "Lasanha" })//filtra se tem a receita de lasanha 
   println(data.filter { it.calorias > 500}) //filtra elementos que tem mais de 500 calorias

   //take e takelast
   println(data.take(2)) //pega as duas primeiras receitas da lista
   println(data.takeLast(2)) //pega as duas últimas receitas da lista

   //forEach
   data.forEach { println(it.nome) } //para cada item da lista retorna o nome da receita
   data.filter { it.calorias > 500 }.forEach { println(it.nome) } //pega o filtro das receitas com maior caloria e retorna o nome de cada receita do filtro

   //max e min
  println(data.maxOf { it.calorias }) //número máximo de calorias dentro das receitas
  println(data.minOf { it.calorias}) //número mínimo de calorias dentro das receitas

  //map
  println(data.map { it.nome } ) //cria uma nova lista com todos os nomes das receitas 
  println(data.map { it.calorias }.sum()) //soma todas as calorias e traz uma nova list
  println(data.map {ReceitaNIngrediente(it.nome, it.ingredientes.count()) }) //conta o número de ingredientes de cada receita

  //average
  listOf(1, 2).average()
  data.map {it.calorias}.average() //retorna a média de calorias de cada receita

  //distinct, sorted e reversed
  val lst = listOf(1, 4, 5, 6, 3, 2, 8, 1, 1, 3, 3)

  println(lst.distinct()) //o distinct elimina todos os valores repetido, isso acontece com qualquer tipos de dados
  println(data.distinctBy { it.nome }) //quantas receitas únicas eu tenho

  println(lst.sorted()) //o sorted ordena a lista de forma crescente
  println(lst.sortedDescending()) // ordena a lista de forma decrescente

  println(lst.reversed()) //reverte a sequência original da lista

}
private fun listaDeDados2(): List<Receita3> {
    return listOf(
        Receita3(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita3("Panqueca", 500),
        Receita3("Omelete", 200),
        Receita3("Parmegiana", 700),
        Receita3("Sopa de feijão", 300),
        Receita3(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}


data class Receita3(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente2(val nome: String, val quantidade: Int)
data class ReceitaNIngrediente(val nome: String, val nIngrediente: Int)
