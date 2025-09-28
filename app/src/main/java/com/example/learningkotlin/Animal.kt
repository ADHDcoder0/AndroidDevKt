package com.example.learningkotlin

open class Animal(){
    open fun sound (){
        println("Animal Makes Sound")
    }
}

class Dog :Animal() {
    override fun sound() {
        println("Dog: Woof!")
    }
}

class Cat :Animal(){
    override fun sound(){
        println("Cat: Meow!")
    }
}

fun main(){
    val Rocky = Dog()
    Rocky.sound()

    val Billi = Cat()
    Billi.sound()
}