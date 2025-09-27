package com.example.myapplication
var Bill:Double = 0.0
val Order:MutableMap<String,Double> = mutableMapOf<String,Double>()
fun main() {
    var switch = true;
    println("-----------------------------------")
    println(
        "Choose Your Desired Option\n" +
                " 1 Coffee   : 50\n" +
                " 2 Cake     : 250\n" +
                " 3 Sandwich : 300\n" +
                " 4 Book     : 250\n" +
                " 5 Juice    : 200\n" +
                " 6 Milk     : 25\n" +
                "Press 0 to Confirm Your Order\n"
    )
    println("-----------------------------------")
    while (switch) {

        print("Enter Your Input here :")
        val obj = readLine()!!.lowercase()

          when (obj) {
            "1" ->Bill+=menu("coffee")

            "2" ->Bill+=menu("cake")

            "3" ->Bill+=menu("sandwich")

            "4"->Bill+=menu("book")

            "5"->Bill+=menu("juice")

            "6"->Bill+=menu("milk")

            "0"->{ switch=false}


        else->println("invalid Input")
    }
    }
    printOrder()

}


fun menu (item:String):Double{
    val cost:Double = when(item){
        "coffee"->50.0
        "milk"->25.0
        "cake" ->250.0
        "sandwich"->300.0
        "book"->250.0
        "juice"->200.0
        else->0.0
    }
    val taxed= cost * 1.15
    orderSum(item,taxed)
    return taxed

}

fun orderSum(item:String,cost:Double){
    Order.put(item,cost)
}
fun printOrder(){
    println("-----------------------------------")
    for ((item,cost) in Order) {
        println("$item = $cost")
    }
    println("Your order Total is $Bill")
    println("-----------------------------------")
    }
