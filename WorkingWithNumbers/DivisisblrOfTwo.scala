package WorkingWithNumbers

object DivisisbleOfTwo extends App{
  /**
  Write a Scala program and use an appropriate data structure to represent the following numerical values:
  2, 8, 19, 20, 25, 50, 100, 10. Define a value function that will identify whether a given numeric
  value is divisible by 2. Using this value function, and starting from the left hand side to the right hand side,
  remove all elements from the abovementioned data structure that are factors of two. But, your program
  should stop removing elements as soon as a number literal is not a factor of two.
Output:
Starting from left to right, removing items that are factors of two, and will
stop execution on the first element that is not divisible by two:
19
20
25
50
100
10
   **/
  val seq = Seq(2, 8, 19, 20, 25, 50, 100, 10)
  def divByTwo : (Int) => Boolean = (x) => x % 2 == 0
  println(
    """
      |Starting from left to right, removing items that are factors of two, and will
      |stop execution on the first element that is not divisible by two:
      |""".stripMargin)
  seq.dropWhile(divByTwo) //The dropWhile() method is utilized to drops the longest prefix of elements
                          // that satisfies the stated condition.
    .foreach(println(_))
}
