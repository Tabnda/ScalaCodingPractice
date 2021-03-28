package ScalaExercises

object ParseValues extends App {
  /**Create a Scala program to parse the corresponding values from the given String "Vanilla Donut 10 2.25",
  where the literal Vanilla Donut is a particular donut, the 10 literal is the quantity purchased, and 2.25 is
  the unit price of each Vanilla Donut. You further need to cast each token from the input String to their
  corresponding types, such as, an Int, Double or String.
  Output:
  Donut Name: Vanilla Donut
  Donut Price: $2.25
  Donut Purchased: 10**/

  val dounutBoughtStr = "Vanilla Donut 10 2.25"
  val splitStr = dounutBoughtStr.split(" ")
  val dounutType = splitStr(0)
  val donutName = splitStr(1)
  val donutPrice = splitStr(2)
  val donutPurchased = splitStr(3)
  val donutOutput =
    """
      |{
      |Donut Name : $dounutType $donutName
      |Donut Price : $donutPrice
      |Dounut Purchased : $donutPurchased
      |}
      s""".stripMargin
      println(donutOutput)
}
