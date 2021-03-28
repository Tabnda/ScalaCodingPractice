package ScalaExercises

object DounutExercise extends App {
  /** Create a Scala program to calculate the total cost for a customer who is buying 10 Glazed donuts.
  You can assume that the price of each Glazed donut item is at $2.50.
  Notice the format of the $25.00 total cost literal, which is essentially at 2 decimal places.
  Output:
   Total cost of 10 Glazed Donuts = $25.00**/
  val glazedDonuts = "Glazed Donuts"
  val quantityPurchased = 10
  val Unitprice = 2.50
  val cost = quantityPurchased * Unitprice
  println(f"""Total Cost Of $quantityPurchased $glazedDonuts ${if (quantityPurchased > 1) "s" else ""}= $$$cost%1.2f""" )

}
