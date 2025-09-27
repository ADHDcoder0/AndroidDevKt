package com.example.myapplication
import kotlin.random.Random
fun main(){
    val Dice1:Int = Random.nextInt(6)
    val Dice2:Int = Random.nextInt(6)
    if(Dice1==Dice2){
        println("COngratulations you have won")
    }
    else{
        println("Better Luck next Time")
    }
}