package WorkingWithNumbers

object MagicNumber extends App {
  /**
   *  Write a Scala value function that will always return true for all numeric literals that match
   *  to some magic number of, say, 77. That is, the value function should of course output false for
   *  all other numeric values. Then, use an appropriate data structure to capture the following numeric
   *  values: 10, 77, 90, 50, 100, 110. Use the value function to verify if the magic number of 77 is part of
   *  the aforementioned numeric values.
   *  Output: Does magic number 77 exist within the numerical value of 10,77,90,50,100,110? TRUE
   * */
  def FindMagicNumber : (Int) => Boolean = (i) => i == 77
  val seqOfNumbers = Seq(10, 77, 90, 50, 100, 110)
  val boolMagicNumberExsists = seqOfNumbers.exists(FindMagicNumber)
  println(s"Does magic number 77 exsists within the numeric value of ${seqOfNumbers.mkString(",")}? ${boolMagicNumberExsists.toString.toUpperCase}")
}

