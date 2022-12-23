
interface Funcionario{
    var salario: Float 
    fun bonus(): Float
}
class Gerente(override var salario: Float) : Funcionario{
    override fun bonus(): Float {
        return salario * 0.5f
    }
}
class Analista(override var salario: Float) : Funcionario{
    override fun bonus(): Float{
        return salario * 0.3f
    }
}

fun mostraBonus(g: Gerente) {
    println(g.bonus())
}

fun mostraBonus(a: Analista){
    println(a.bonus())
}

fun main(){
    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(4000f))

    try {

    } catch (e: Exception) {
    } catch (e: NullPointerException) {
    } catch (e: ArithmeticException) {
    }
    
}

// ou com abstract 

/*
abstract class Funcionario(var salario: Float){
    abstract fun bonus(): Float
}
class Gerente( salario: Float) : Funcionario(salario){
    override fun bonus(): Float {
        return salario * 0.5f
    }
}
class Analista(salario: Float) : Funcionario(salario){
    override fun bonus(): Float{
        return salario * 0.3f
    }
}

fun mostraBonus(func: Funcionario) {
    println(func.bonus())
}



fun main(){
    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(4000f))
    
}

 */
