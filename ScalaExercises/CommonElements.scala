package ScalaExercises

object CommonElements extends App{
  /**Let us assume that you two shopping baskets with a bunch of items in each one.
  The first contains elements: "Cake", "Milk", "Cheese", "Toilet Paper",
  and the second one has the following items: "Bread", "Water", "Juice", "Milk", "Cheese".
  Write a Scala program to find the common items between the two shopping baskets.
  You can use whichever data structure that you feel is appropriate for this particular problem.
  Output:
  Shopping Basket One = Cake - Milk - Cheese - Toilet Paper
  Shopping Basket Two = Water - Milk - Juice - Cheese - Bread
  Common items are:

  MILK
  CHEESE**/
  val setBasketOne = Set("Cake","Milk","Cheese","Toilet Paper")
  val setBasketTwo = Set("Water","Milk","Juice","Cheese","Bread")
  val commonElements = setBasketOne intersect setBasketTwo
  println(
    s"""
      |Shopping Basket One = ${setBasketOne.mkString("-")}
      |Shopping Basket Two = ${setBasketTwo.mkString("-")}
      |Common Items are:
      |""".stripMargin
  )
  commonElements.foreach(item => println(item.toUpperCase()))
}
