fun main(){

    //objeto(f1) - endereço de memória mem1
    //objeto(f2) - endereço de memória mem2
    val f1: FormaData = FormaData(10, 8)
    var f2: FormaData = FormaData(10, 8)
    println(f1.equals(f2)) //está comparando endereço de memória, não valores!
    println(f1.toString())
    println(f1.hashCode())
    println("---------")
    println(f2.toString())
    println(f2.hashCode())

    f2 = f1.copy(50)
}

class Forma(val a: Int, val b: Int){ // faz com que a gente compare os valores do equals e retorne true ou false se forem ou não  iguais
    override fun equals(other: Any?): Boolean{
        return if(other is Forma) {
             (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    
    }
        override fun toString(): String {
            return "${this.a} + ${this.b}"
        }

        override fun hashCode(): Int{
            return super.hashCode()
        }
    }


    //ou podemos simplesmente criar o data class, atribuir o data depois das variaveis forma e comparar os valores diretamente

//todo objeto tem equals, toString e hashcode por debaixo dos panos
data class FormaData(val a: Int, val b: Int) {}

data class Endereco(val rua: String, val cep: String, val city: String)
fun endereco(e: Endereco) {}