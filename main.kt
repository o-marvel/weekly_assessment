import usingpackage.Mammal

fun main(args: Array<String>) {
//////////
        fuzzBuzzGame ()
//////////
       strReverserGame()





} // main loop ends here
fun fuzzBuzzGame (){
    var scores = 1..100

    for (x in scores) {
        if (x % 3 == 0) {
            println(" $x :  buzz")
        } else if (x % 5 == 0) {
            println(" $x : fuzz")
        }
        if (x % 3 == 0 && x % 5 == 0) {
            println(" $x : fuzz buzz")
        }
    }
}
fun strReverserGame(){
      var names :String = "Marvelous"
    println(names.indices)
    var l = names.length-1
    println(l)
    for (index in names.indices){
        print((names[l - index]).toString())
    }
}


//fun anyStringReverserGame() {
//    println("please enter a string to start this game .... ")
//    var names = readLine()
//    if (names is String) {
//        println(names.indices)
//        var l = names.length - 1
//        println(l)
//        for (index in names.indices) {
//            print((names[l - index]).toString())
//        }
//    } else {
//        println("$names is not a valid string")
//    }
//}

