package ScalaExercises

//Create a Scala program to find the 8th character in the String: "http://allaboutscala".
//Output:
//The 8th character literal in http://allaboutscala.com

object EighthCharacterInString extends App{

  val string = "http://allaboutscala"
  val charToFind = string.charAt(8)
  println(s"The 8th character in String $charToFind")


}
