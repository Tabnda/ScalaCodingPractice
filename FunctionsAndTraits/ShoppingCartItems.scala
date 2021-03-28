package FunctionsAndTraits



object ShoppingCartItems extends App{
  /**
  Write a Scala program and use the Tuple type to represent a shopping cart item with the following properties:
  a name, a price, and a quantity bought. Thereafter, use a case class to represent the above shopping cart item.
  You can use the following shopping cart item as an example: A packet of rice at $10.99 and quantity bought is 5.
  Output:
  A packet of rice is currently priced at $10.99, and the customer bought 5.
  A packet of rice is currently priced at $10.99, and the customer bought 5.
  **/
  val item = Tuple3("packet of Rice", 10.99 , 5)
  println(s"A ${item._1} is currently priced at $$${item._2}, and the customer bought ${item._3}")

  final case class shoppingCartItems(name:String,price:Double, quantity : Int)
  val cartItem = shoppingCartItems(
    name = "packet of Rice",
    price = 10.99,
    quantity = 5
  )
  println(s"A ${cartItem.name} is currently priced at ${cartItem.price}  and the customer bought ${cartItem.quantity}.")
}
