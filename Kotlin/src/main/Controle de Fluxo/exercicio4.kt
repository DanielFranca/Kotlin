fun main(){
    verificaLados(10, 10, 10)
}

fun verificaLados(ladoA: Int, ladoB: Int, ladoC: Int){
    if(ladoA == ladoB && ladoA == ladoC){
        println("Triângulo equilátero!")
    } else{
        println("Não é um triângulo equilátero!")
    }

}