import usingpackage.Mammal

fun main(args: Array<String>) {
// var human = Mammal("black", 4, "land")
//    println(human.habitat)

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

   // this will reverse the string
    var fullName : String = " good food"
      var r = fullName.reversed()
    println(r)

} // main loop ends here

