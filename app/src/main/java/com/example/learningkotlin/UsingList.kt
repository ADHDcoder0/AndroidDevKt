package com.example.myapplication

fun main(){
    //usimng list
    //unmutable list
    val menu =listOf("butter chicken","panner chilli","rasgulla","biryani")
    //mutable list
    val menu2 =mutableListOf("butter chicken","panner chilli","rasgulla","biryani")
    menu2[3]="Kheer"

    menu2.add("Jalebi")

    menu2.remove("biryani")
    println(menu2)

    //declaring data type
    var fruit: MutableList<Int> = mutableListOf(1,2,3,4)
//    var = variable → you can reassign a new list later.
//    val = value → you cannot reassign it, but you can still modify the contents (because the list is mutable).

}