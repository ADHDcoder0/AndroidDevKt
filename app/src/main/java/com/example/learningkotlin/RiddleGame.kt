package com.example.myapplication.assignemnt
import kotlin.random.Random
fun main() {
    var n=1
    do {
        val rand: Int = Random.nextInt(1, 20)
        printRiddle(rand)
        print("Type your Answer here :")
        var ans: String = readLine()!!.lowercase().trim()
        var cond = checkAnswer(rand, ans)
        if (cond) {
            println("Your answer was right answer" )
                    if( (3-n) !=0){
                        println("${3-n} Riddle more to Unlock the Door ")
                     }
                    else println("You won The Gate to the Treassure Opens")
                     n++
        }
        else {
            println("try again")


        }
    }while(n<=3)
}

fun printRiddle(num: Int) {
    when (num) {
        1 -> println("I flow through many states, giving life to millions, and am worshipped in a festival of Ganga Dussehra. Who am I?")
        2 -> println("I wear a crown, shine in the sky, and rise every morning over the Himalayas. Who am I?")
        3 -> println("I am yellow, used in prayers and cooking, and everyone in India knows me well. What am I?")
        4 -> println("I am a holy city, where rivers meet and pilgrims gather for Kumbh. Where am I?")
        5 -> println("I am spicy and red, used in every Indian curry. What am I?")
        6 -> println("I am round and golden, eaten with dal or sabzi, and sometimes fried. What am I?")
        7 -> println("I am a festival of lights, celebrated with lamps, sweets, and fireworks. What am I?")
        8 -> println("I am a mountain range in the north, home to snow and sages. What am I?")
        9 -> println("I am a bird that symbolizes peace and is sacred in India. What am I?")
        10 -> println("I am made of clay, decorated, and broken in Janmashtami. What am I?")
        11 -> println("I am a sacred tree, often worshipped in villages and near temples. What am I?")
        12 -> println("I am worn on weddings, red or green, and cover a bride’s head. What am I?")
        13 -> println("I am the Indian festival where colors fly and everyone gets messy. What am I?")
        14 -> println("I am a musical instrument played in temples and folk dances, shaped like a drum. What am I?")
        15 -> println("I am a monument of love, made of white marble in Agra. What am I?")
        16 -> println("I am sweet, syrupy, and round, often eaten in India during festivals. What am I?")
        17 -> println("I am the Indian currency with Mahatma Gandhi’s face on me. What am I?")
        18 -> println("I am the Indian space agency that launched satellites like Mangalyaan. Who am I?")
        19 -> println("I am a holy text, containing stories of Krishna, Rama, and dharma. What am I?")
        20 -> println("I am a snake charmer’s companion, long and slithering, in Indian villages. What am I?")
        else -> println("Invalid riddle number!")
    }
}

fun checkAnswer(num: Int, answer: String): Boolean {
    return when (num) {
        1 -> answer == "ganga"
        2 -> answer == "sun" || answer == "surya"
        3 -> answer == "turmeric" || answer == "haldi"
        4 -> answer == "prayagraj" || answer == "allahabad"
        5 -> answer == "red chili" || answer == "lal mirch"
        6 -> answer == "roti" || answer == "chapati" || answer == "poori"
        7 -> answer == "diwali"
        8 -> answer == "himalayas"
        9 -> answer == "peacock"
        10 -> answer == "matka"||answer=="dahi handi"
        11 -> answer == "peepal tree"
        12 -> answer == "dupatta" || answer == "chunari" || answer == "ghoonghat"
        13 -> answer == "holi"
        14 -> answer == "dhol" || answer == "tabla"
        15 -> answer == "taj mahal"
        16 -> answer == "gulab jamun"
        17 -> answer == "rupee" || answer == "gandhi note"
        18 -> answer == "isro"
        19 -> answer == "bhagavad gita" || answer == "mahabharata" || answer == "ramayana"
        20 -> answer == "cobra"
        else -> false
    }
}