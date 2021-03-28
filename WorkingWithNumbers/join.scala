package WorkingWithNumbers

object join extends App{
  /**
  Write a Scala program and use an appropriate data structure to represent the following number
  literal: 99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0. Assume a second data structure with the following number
  literals: 10.0, 20.0, 30.0, 40.0, 50.0. Join the two data structures together, and thereafter find the lowest
  and the largest number literal from the combined number literals.
Output:
Combined number literals = List(99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0, 10, 20, 30, 40, 50)
Lowest number literal = -1.0
Largest number literal = 100.0
  **/
  val seq1 = Seq(99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0)
  val seq2 = Seq(10.0, 20.0, 30.0, 40.0, 50.0)
  val combinedNumberLiteral = seq1 ++ seq2
  println(s"Combined number literals =  ${combinedNumberLiteral}")
  println(s"Lowest Number Literal = ${combinedNumberLiteral.min}")
  println(s"Largest number literal = ${combinedNumberLiteral.max}")
}
