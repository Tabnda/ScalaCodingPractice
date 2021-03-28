package WorkingWithNumbers

object ListWithSequenceOfNumbers extends App{
  /**
  Create a Scala program to represent a List with a sequence of number from 100 to 150. You should omit
  the last numeric item of 150, and each numeric item should have a 10 numeric interval. You should then
  calculate the sum of all the numeric items in the List.
Output:
Elements of Vector from 100 to 150, excluding the 150 number literal = 100, 110, 120, 130, 140
Sum for elements in the List = 600

  **/
  val listRange = List.range(100,150,10)
  val listRangeAsString = listRange.mkString(", ")
  print(s"Elements of Vector from 100 to 150, excluding the 150 number literal = ${listRangeAsString}  ")
  print(s"Sum for elements in the list = ${listRange.sum}")


}
