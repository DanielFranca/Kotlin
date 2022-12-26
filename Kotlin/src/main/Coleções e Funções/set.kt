

fun main(){

   

    val set1: Set<String> = setOf<String>("Paris", "Osasco", "Berlim", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf<String>()

    set2.add("São Paulo")
    set2.remove("São Paulo")
    set2.contains("São Paulo")

    set2.clear()
    //set2.removeAt() = não existe porque não existe index, o set é um conjunto ordenado diferentemente do list;
    set2.size


}