fun main(){
    contadores()
}
fun contadores(){
    var soma = 0
    for(i in 1..500){
        soma += 1
    }
    println("Soma: $soma")
}