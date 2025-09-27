package com.example.myapplication

fun main(){
    var ScoreCard = mapOf("Kushagra" to 100,"krishna " to 99)
    println(ScoreCard["Kushagra"])
    println(ScoreCard.count())
    println(ScoreCard.containsKey("krsihna"))
    println(ScoreCard.keys)
    println(ScoreCard.values)
    controlFLow()
    usingWhen()
}
fun controlFLow(){
    println("Enter Your Value 1 :")
    var n:Int=readLine()!!.toInt()
    println("Enter Your Value 2 :")
    var m=readLine()!!.toInt()
    if(n>m){
        println("$n is laregst")
    }else{
        println("$m is laregst")
    }
}

fun usingWhen(){
    //Checking the price of items
    println("Enter The Item you want to check price available options")
    var obj =readLine()!!.lowercase()
    println(
        when (obj){
            "apple"->100
            "guave"->40
            "milk"->50
            else->"No Item Found"

        }
    )

}