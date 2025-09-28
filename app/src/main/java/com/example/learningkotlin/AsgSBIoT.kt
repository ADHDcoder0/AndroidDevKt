package com.example.learningkotlin

fun main(){
   val i= factorial(5)
    //println(i)
    //nullCheck()
    evenFilter(5)
}
fun largestOfThree(){
    println("Enter First Input")
    val a:Int =readLine()!!.toInt()
    println("Enter Second Input")
    val b:Int =readLine()!!.toInt()
    println("Enter Third Input")
    val c:Int =readLine()!!.toInt()
    val max:Int
    if(a>b&&a>c) max=a
    else if(b>a&&b>c) max=b
    else max=c
}

fun factorial(n:Int):Int{

    if(n==0) return 1
    else if(n<0) return -1
    else {
        return n* factorial(n-1)
    }

}

fun nullCheck(){
    var check : String?
    println("Enter Your Name")
    check = readLine()
    if(check!=null&&check.length!=0){
        println(check)
    }
    else println("No Name")

}

fun evenFilter(n:Int){
    var num: MutableList<Int> = mutableListOf<Int>()
    for(it in 1..n){
        println("ENter The $it element ")
        var entry = readLine()!!.toInt()
        num.add(entry)
    }
    println("Even Numbers are:")
    for(m in num){
        if(m%2==0){
            println("$m ")
        }
    }

    println("Even number Using .filter function")
    num.filter{it%2 ==0}.forEach {println(it) }
}


