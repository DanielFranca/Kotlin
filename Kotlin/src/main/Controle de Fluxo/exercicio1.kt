/*  Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final do ano. 
 Os bÔnus são classificados por cargo.

 A. Gerentes recebem R$ 2.000,00
 B. Coordenadores recebem R$ 1.500,00
 C. Engenheiros de software recebem 1.000,00
 D. Estagiários recebem R$ 500,00  :(

 */

 fun main(){
    val bonus = bonificacao("Gerente", 2)
    println(bonus)
 }


 fun bonificacao(cargo: String, anosDeExperienciencia: Int): Float{
    
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
 
