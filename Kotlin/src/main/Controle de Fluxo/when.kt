fun main(){
    bonusWhen("Gerente")

    val n = false
    when (n) {
        true -> println("1..10")
        false -> println("10..100")
    }

    if(n) {
        println("true")
    } else {
        println(" ") 
    }
 }


 fun bonificacao2(cargo: String, anosDeExperienciencia: Int): Float{
    
    if(cargo == "Gerente" && anosDeExperienciencia < 2 ){
        return 2000f
    } else if(cargo == "Gerente" && anosDeExperienciencia >= 2) {
        return 3000f
    } else if(cargo == "Coordenadores" && anosDeExperienciencia < 1){
        return 1500f
    } else if (cargo == "Coordenadores" && anosDeExperienciencia >= 1){
        return 1800f
    } else if(cargo == "Engenheiros"){
        return 1000f
    } else if(cargo == "Estagiários"){
        return 500f
    } 

    return 0f
 }

 fun bonusWhen(cargo: String): Float {
    return when (cargo){
        "Gerente" ->  2000f
        "Coordenador" ->  1500f
        "Engenheiro de Software" ->  1000f
        "Estagiário" ->  500f
        else -> 0f

        }
    
 }