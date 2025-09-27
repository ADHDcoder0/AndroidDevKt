fun collections(){
    val fal = listOf("Seb","Kela","Amm")
    var fruit:MutableList<Int> =mutableListOf(1,2,3,4,5)
    println(fal.first())
    println(fal.last())
    println(fruit.add(7))
    println(fruit.count())
    println("Amm" in fal)
    println(fruit.remove(3))
    println(fruit.removeAt(1))

}