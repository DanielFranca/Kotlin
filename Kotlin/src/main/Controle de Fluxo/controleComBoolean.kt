fun main(){


}

fun saudacao (dia: Boolean): String {
    return if (dia) {
         "Bom dia"
    } else {    // se usarmos return if, temos que usar else obrigatoriamente
         "Boa noite"
    }
}

//redução de linha e mais didático

fun saudacao2(dia: Boolean) = if (dia) {
    "Bom dia"
} else {
    "Boa noite"
}

// ou com if else como é mais usado

/* fun saudacao3(dia: Boolean){
    if(saudacao3) {
        return "Bom dia"
    } else if {
        return "Boa noite"
    }
}
*/
