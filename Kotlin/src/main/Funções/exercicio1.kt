
/* 
Escreva uma função que seja capaz de receber a quantidade
de anos e transformar em meses, dias, horas, minutos e segundos.

Saída desejada: 

2 anos equivalem a: 24 meses, 730 dias, 17520 horas, 1051200 minutos, 63072000 segundos
 */


 /*
 Para resolver pensei em trazer uma base de ano, então calculei os atributos de um ano, e criei 3 funções além da Main;
 Uma para retorno os atributos de um ano;
 Outra para pegar o tanto de anos que o usuário deseja descobrir
 e a outra para retornar exatamente 2 anos, que era exatamente o que o exercício pedia... 
 */

 fun main(){

println(UmAnoTem())
println(doisAnosTem()) //forma 1
println(converterAnos(2)) // forma 2


 }

 fun UmAnoTem( mesesAno: Int = 12, diasAno: Int = 365, horasAno: Int = 8760, minutosAno:Int = 525600, segundosAno:Int = 31536000){
    println("Um ano tem ${mesesAno} meses, ${diasAno} dias, ${horasAno} horas, ${minutosAno} minutos, ${segundosAno} segundos")
 }

 fun converterAnos(anos: Int, mesesAno: Int = 12, diasAno: Int = 365, horasAno: Int = 8760, minutosAno:Int = 525600, segundosAno:Int = 31536000){
    println("${anos} equivale a: \n ${mesesAno * anos}  meses, \n ${diasAno * anos}  dias, \n ${horasAno * anos}  horas, \n ${minutosAno * anos}  minutos, \n ${segundosAno * anos}  segundos! ")

 }
 

 // ou posso coletar exatamente o que o exercicio pede e trazer somente os valores de meses, dias, horas, minutos e segundos de 2 anos.. ficaria assim

 fun doisAnosTem(mesesAno: Int = 12, diasAno: Int = 365, horasAno: Int = 8760, minutosAno:Int = 525600, segundosAno:Int = 31536000){
    println(" 2 anos equivale a: \n ${mesesAno * 2} meses, \n ${diasAno * 2} dias, \n ${horasAno * 2} horas, \n ${minutosAno * 2} minutos, \n ${segundosAno * 2} segundos! ")
 }