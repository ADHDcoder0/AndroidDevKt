package com.example.learningkotlin
import kotlinx.coroutines.*
import kotlinx.coroutines.runBlocking
fun main(){
    runBlocking {

        delay(2000)
        println("Done!")
    }
}