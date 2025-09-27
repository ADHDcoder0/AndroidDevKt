package com.example.myapplication

var itmes:MutableMap<String, String> = mutableMapOf<String,String>()
//creating list of pair SYNTAX-- Pair<String,String>
fun main(){
    //
    //TAKING INPUT FROM THE USER
    var item:String
    var location:String

    var switch = true;
    while(switch) {
        var obj: String
        println("Choose Your Desired Option\n" +
                "Press 1 to Add Lost Items\n" +
                "Press 2 to Search Lost Item\n" +
                "Press 3 top Search Items Lost at A Place\n" +
                "Press 4 to Remove a certain Item\n" +
                "Press 5 to Display The complete List\n" +
                "Press X to Exit the program\n"
        )
        obj=readLine()!!.lowercase()

        when(obj){
            "1"->{
                println("Enter the item to add")
                item = readLine()!!.lowercase()
                println("Enter the Location of $item" )
                location = readLine()!!.lowercase()
                addToList(item,location)
            }
            "2"->{
                println("Enter the item to search")
                item = readLine()!!.lowercase()
                searchInList(item)
            }
            "3"->{ println("Enter the Location to search" )
                location = readLine()!!.lowercase()
                searchForLocation(location)
            }
            "4"->{
                println("Enter the item to")
                item = readLine()!!.lowercase()
                removeFromList(item)
            }
            "5"->println(itmes)
            "x"-> switch = false
            else->println("invalid Input")
        }


    }
}
fun addToList(X:String,Y:String) {
    println("Are you sure you wish to proceed \nPress Y to Continue")
    val opt = readLine()!!.lowercase()
    if (opt == "y") {
        itmes.put(X, Y)
        println("$X lost at $Y Successfully Added to the list")
    } else {
        println("Item Not Added to the list")
    }
}
fun removeFromList(X:String) {
    println("Are you sure you wish to proceed \nPress Y to Proceed")
    val opt = readLine()!!.lowercase()
    if(opt=="y") {
        itmes.remove(X)
        println("$X removed from the list")
    }
    else println("Item not removed")
}

fun searchInList(key:String){
    if(key in itmes) {
        println("$key is in  the ${itmes.getValue(key)}")
    }
    else {
        println("No such item found")
        println("Do you want to Enter it in the list \n Press Y to record /n else click any option to continue")
        val opt = readLine()!!.lowercase()

        when (opt) {
            "y" -> {
                println("Enter the place you lost it :")
                val loc = readLine()!!.lowercase()
                addToList(key, loc)
            }

            else -> println("OK No Problem")

        }
    }
}
fun searchForLocation(X:String){
        var found =false
        for ((key ,values) in itmes){

            if( values==X){
                println("$key was found at $values ")
                found=true
            }

        }
    if(found==false){
        println("No item Found at $X")
        println("Do you want to Enter it in the list \n Press Y to record /n else click any option to continue")
        val opt = readLine()!!.lowercase()
        when (opt) {
            "y" -> {
                println("Enter the Item you lost :")
                val key = readLine()!!.lowercase()
                addToList(key,X)
            }
            else -> println("OK No Problem")
        }
    }
}

