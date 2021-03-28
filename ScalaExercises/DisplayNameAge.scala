package ScalaExercises
import scala.io.StdIn._
//Create a Scala program to prompt customers for their name and age.
// The format for the name and age labels should be in bold. And, the name literal should be underlined.
//Output:
//Name: Nadim Bahadoor
//Age: 38
object DisplayNameAge extends App{


  val name = readLine("Enter your Name..")
  println("Enter your Age..")
  val age = readInt()
  println(Console.BOLD)
  print("Name: ")
  println(Console.UNDERLINED)
  print(name)
  println(Console.BOLD)
  print("Age: ")
  println(Console.RESET)
  print(age)



}
