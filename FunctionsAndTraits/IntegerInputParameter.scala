package FunctionsAndTraits

object IntegerInputParameter extends App{
  /**
  Write a Scala program that defines a method with an integer input parameter.
  You can use this method to produce the following output.
  Output:
  10 as String literal = 10
  Create another method similar to the above-mentioned,
  but this particular method should accept an arbitrary integer input parameters as opposed to just one.
  You can then use this method to produce the following output.
  Output:
  10, 11, 12 as String literals = 10 :: 11 :: 12
  **/
  def integerInputParam(num: Int): String = {
    num.toString
  }
  println(s"10 as String literal = ${integerInputParam(10)}")

  def integerInputParams(numbers : Int*) : String = {
    numbers.mkString(" :: ")
  }
  println(s"10, 11, 12 as String literals =  ${integerInputParams(10,11,12)}" )

}

