package com.example.learningkotlin
import kotlinx.coroutines.*
import kotlinx.coroutines.runBlocking

fun main() {
    println("Choose an option:")
    println("1. Factorial")
    println("2. Null Check")
    println("3. Even Filter")
    println("4. Largest of Three")
    println("5. Palindrome Check")
    println("6. Corouitne Delay")
    val choice = readLine()!!.toInt()

    when (choice) {
        1 -> {
            println("Enter a number:")
            val n = readLine()!!.toInt()
            println("Factorial of $n = ${factorial(n)}")
        }
        2 -> nullCheck()
        3 -> {
            println("How many numbers do you want to enter?")
            val n = readLine()!!.toInt()
            evenFilter(n)
        }
        4 -> largestOfThree()
        5 -> {
            println("Enter a word:")
            val word = readLine()!!
            if (word.isPalindrome()) {
                println("$word is a palindrome")
            } else {
                println("$word is not a palindrome")
            }
        }
        6 -> coRoutineDelay()
        else -> println("Invalid choice")
    }
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
    println("The largest Number is $max")
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
        val entry = readLine()!!.toInt()
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

//fun operate(){}

fun String.isPalindrome() : Boolean {
    if (this == this.reversed()) {
        return true
    }
    else return false
}


fun coRoutineDelay(){
    runBlocking {
        delay(2000)
        println("Done!")
    }
}