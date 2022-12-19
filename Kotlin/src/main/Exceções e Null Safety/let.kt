

import kotlin.text.lowercase

fun main(){
    val str: String? = null

    if(str != null) {
        str.lowercase()
        str.length
    }

    //ou com let..

    str?.let { //it: String
        // corpo
        // scope function
        it.lowercase()
        it.length
    }
    
}