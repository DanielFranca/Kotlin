//Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6 km)

fun main() {
    converteEmkm(10)
}

fun converteEmkm(milhas: Int, km: Float = 1.6f){
    println("10 milhas equivalem a ${milhas * km} km")
}