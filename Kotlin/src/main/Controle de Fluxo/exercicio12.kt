fun main(){
    var i: Int = 1
    while(i < 50){
        if(i % 3 == 0){
            print("Buzz")
        }else if(i % 5 == 0){
            print("Fizz")
        }else if(i % 3 == 0 && i % 5 == 0){
            print("FizzByuzz")
        } else{
            print("$i")
        }
        i++
    }
}