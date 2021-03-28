package ScalaExercises

object CouponCodes extends App{
  /**
  Assume the following lexical coupon codes: "A", "BB", "CCC", "DDDD", "EEEEE".
  Write a Scala program to create a new set of coupon codes based on the above one.
  The format for each coupon code should be as follows: "coupon code - i", where the number i is derived from the
  length of each corresponding coupon code.
  Output:
  A - 1
  BB - 2
  CCC - 3
  DDDD - 4
  EEEEE - 5
  **/
  val couponCodes = Set("A","BB","CCC","DDDD","EEEEE")
  val codesWithLength = couponCodes.map{code => s"$code - ${code.length}"}
  codesWithLength.foreach(println(_))
}
