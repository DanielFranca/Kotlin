fun main(){
escada(4)
}
fun escada(num: Int){
    for(i in 1..num){
        for(j in 1..i){
            print("#")
        }
        println()
    }
}
