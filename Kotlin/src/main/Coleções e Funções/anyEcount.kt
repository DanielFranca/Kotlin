

import kotlin.collections.first

fun main(){

    val data = listaDeDados()

    println("Tenho dados? ${if (data.any()) "sim" else "não"}")
    println("Tenho ${data.count()} elementos")
}


private fun listaDeDados(): List<Receita2> {
    return listOf(
        Receita2(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita2("Panqueca", 500),
        Receita2("Omelete", 200),
        Receita2("Parmegiana", 700),
        Receita2("Sopa de feijão", 300),
        Receita2(
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


data class Receita2(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)
