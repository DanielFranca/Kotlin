fun main(){
    var caixa: Int = 2000
    var baloes: Int = 7
    var contador: Int = 0

    while(baloes < caixa){
        baloes = baloes + 7
        contador++
    }
    print("Será necessário um total de ${contador} balões para encher a caixa d´água!")
}