package ScalaExercises

object ShoppingBasket extends App{
  /**
  Write a Scala program and use the Tuple type to represent items in a shopping baskets:
"T-Shirt", "Medium", 10.99
"Polo-Shirt", "Large", 4.99
"Vest", "Small", 5.99
"T-Shirt", "Small", 4.99
"T-Shirt", "Small", 4.99
You are free to use whichever data structure is appropriate to store the above-mentioned items.
  The Scala program should then output all "T-Shirt" items in upper case format.
  Note that all other items in the shopping basket should then be in the lower case format.
  Output:
T-SHIRT is priced at $10.99 for the Medium size.
polo-shirt is priced at $4.99 for the Large size.
vest is priced at $5.99 for the Small size.
T-SHIRT is priced at $4.99 for the Small size.
T-SHIRT is priced at $4.99 for the Small size.
  **/
  val item1 = Tuple3("T-Shirt", "Medium", 10.99)
  val item2 = Tuple3("Polo-Shirt", "Large", 4.99)
  val item3 = Tuple3("Vest", "Small", 5.99)
  val item4 = Tuple3("T-Shirt", "Small", 4.99)
  val item5 = Tuple3("T-Shirt", "Small", 4.99)

  val shoppingBasket = List(item1,item2,item3,item4,item5)
  shoppingBasket.foreach{
    case item if item._1 == "T-Shirt" =>
      println(s"${item._1.toUpperCase()} is priced at $$${item._3} for the ${item._2} size")
    case item =>
      println(s"${item._1.toLowerCase()} is priced at $$${item._3} for the ${item._2} size")
  }
}
