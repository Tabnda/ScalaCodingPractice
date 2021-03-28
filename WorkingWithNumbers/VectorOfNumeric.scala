package WorkingWithNumbers

object VectorOfNumeric extends App{
  /**
  Create a Vector with the following numeric items: 0, 10, 20, 47, -2, 99, -98.
  Write a Scala program to find the smallest and the largest numeric item in the Vector.
Output:
The smallest item in the Vector = -98
The largest item in the Vector = 99
   **/
  val vector = Vector(0,10,20,47,-2,99,-98)
  println(s"The smallest item in the Vector = ${vector.min}")
  println(s"The largest item in the Vector = ${vector.max}")
}
