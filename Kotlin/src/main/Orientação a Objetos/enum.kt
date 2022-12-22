enum class Prioridade(val value: Int) {
    Baixa(1){
        override fun toString(): String { //sobreescrevendo o construtor
            return "Prioridade baixa: $value" //com a o toString consigo customizar o que vai ser impresso
        }
    },
    Media(5){

    },
    Alta(15){

    }
}



enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca
}


fun main(){
    //enum
    for(p in Prioridade.values()) {
        println(p.value)
    }
}