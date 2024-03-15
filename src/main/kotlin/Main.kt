fun main() {
   var x: Int?= 5
    x = null

    var creature= arrayOf("camel", "tiger", "cheetah", "elephant", "donkey")
    creature.forEach { animal ->
        println("cheetah")
    }
    for (creature in creature) {
        println(creature)
    }


//
//
//
    println(creature.slice(2..4))
    creature = creature.sortedArray()
    println(creature.contentToString())


    var animals: Array<String?> = arrayOf("dogs", "cats", "parrot", "hen", "cow")
//    println(animals.indexOf("hen"))
    animals=animals.plus("hourse")
    animals=animals.plus(arrayOf("rat", "monkey", "squirrel"))
    println(animals.contentToString())
    animals[1]=null
    println(animals.contentToString())
    println(animals[2])
    println(animals[4])
    println(animals.get(3))
   animals.set(4,"goats")
    animals[2] = "goat"
    animals[3] = "sheep"
    println(animals.contentToString())

    var kanini = arrayOf("Mary", 22, 5.2, "Mombasa", false)
    println(kanini.contentToString())

    val statistics = arrayOf(23, 567, 43, 213, 56, 6, 7788, 4, 332)
    for (j in statistics) {
        println(j * j)
    }
   println(statistics.size)
    println(statistics.count())
   println(statistics.sum())
   println(statistics.minOrNull())
    println(statistics.maxOrNull())
   println(statistics.sum() / statistics.size)
    println(statistics.sum() % statistics.count())
    println(statistics.sum() / statistics.size.toDouble())
    println(statistics.average())

    statistics.forEach { x ->
        println(x * x)
    }
}





