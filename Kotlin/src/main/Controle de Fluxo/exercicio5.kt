

import kotlin.text.lowercase
//portaria()


fun main(){
    portaria()

}
fun portaria(){
    println("Digite sua idade")
     val idade = readLine()

    if(idade != null && idade != ""){
        idade.toInt()
        if(idade >= "18")
            println("Welcome")
        } else {
           println("Negado. Convite Inválido")
    }

    println("Qual é o tipo de convite? ")
    var convite = readLine()

    if(convite != null && convite != "") {
        convite = convite.lowercase()

        if(convite == "Comum" || convite == "Premium" || convite == "luxo"){
            print("Qual o código do convite?")
            var codigo = readLine()

            if(codigo != null && codigo != ""){
                codigo = codigo.lowercase()
                if(convite == "comum" && codigo.startsWith("xt")){
                    println("Welcome")
                } else if(convite == "premium" || convite == "luxo" && codigo.startsWith("xl")){
                    println("Welcome :)")
                } else {
                println("Negado. Convite inválido.")
            }
        }   
        println("Negado. Convite inválido.")
    }
}
}
