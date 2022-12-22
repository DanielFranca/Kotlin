fun main(){
    val p = Pessoa(2003, "Daniel")
    p.acordar()
    p.dormir()

    with(p){ //this = pessoa
        acordar()
        dormir()
        

    }
}
