package ScalaExercises

// Create a Scala program to reverse,
// and then format to upper case, the given String: "http://allaboutscala.com/scala-exercises

object ReverseAndToUpper extends App{
  val strToFormat = "\"http://allaboutscala.com/scala-exercises"
  val reverseAndTouppercase = strToFormat.reverse.toUpperCase
  println(s"$strToFormat Reversed the string and converting to uppercaes $reverseAndTouppercase")

}
