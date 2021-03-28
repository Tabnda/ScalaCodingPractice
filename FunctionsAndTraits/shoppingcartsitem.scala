package FunctionsAndTraits

object shoppingcartsitem extends  App {
  /**
  Write a Scala program and use a case class to define a shopping cart item.
  Each shopping cart item should have the following properties, namely, a name, a price, and a quantity bought.
  Create three shopping cart items for the following items:
  10 vanilla ice cream at $2.99 each
  3 chocolate biscuits at $3.99 each
  5 cupcakes at $4.99 each

Use an appropriate data structure to store the above-mentioned shopping cart items.
  Thereafter, define and use a method that will print out all items from a given shopping cart.
Output:
10 vanilla ice cream at $2.99 each
3 chocolate biscuits at $3.99 each
5 cupcakes at $4.99 each

  Define also another method that given a shopping cart basket will only output vanilla ice cream products.
  A generic message, such as, "Found another item", will be the output for all other items.
Output:
Found another item.
Found another item.
Found a cupcake item.
  **/
  final case class shoppingCartItem(name:String,  price: Double, qantity:Int)
  val shoppingCartItem1 = shoppingCartItem("vanilla ice cream", 2.99, 10)
  val shoppingCartItem2 = shoppingCartItem("chocolate biscuits", 3.99, 3)
  val shoppingCartItem3 = shoppingCartItem("cupcake", 4.99, 5)

  val basket = List(shoppingCartItem1,shoppingCartItem2,shoppingCartItem3)

  def printCartsItem(basket : List[shoppingCartItem]) : Unit = {
    basket.foreach{
      item =>
        println(s"${item.qantity} ${item.name} at ${item.price} each")
    }
  }
  printCartsItem(basket)
  def icecreamItem(basket : List[shoppingCartItem]) : Unit = {
    basket.foreach {
      case shoppingCartItem("cupcake",_,_) => println("Found a cupcake item")
      case shoppingCartItem(_,_,_) => println("Found another item")
    }
  }
  icecreamItem(basket)

}
