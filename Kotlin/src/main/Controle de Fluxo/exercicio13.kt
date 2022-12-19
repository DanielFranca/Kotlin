fun main(){
    frase2("Daniel tem 19 anos")
}
fun frase2(str: String){
    var length: Int = str.length

    while(length > 0){
        print(str[length - 1])
        length--
    }
}