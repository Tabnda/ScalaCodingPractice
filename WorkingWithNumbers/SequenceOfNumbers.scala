package WorkingWithNumbers

object SequenceOfNumbers extends App{
  /**Create a Scala program that defines a sequence of numbers from 100 to 110.
  The sequence should include the 100 starting number literal, and ends with the 110 number literal.
  Output:
  Number range from 100 to 110 inclusive = 100 101 102 103 104 105 106 107 108 109 110**/

  val numberRange = 100 to 110
  print("The range of numbers from 100 to 110 inclusive = ")
  numberRange.foreach(number => print(s"$number  "))
}
