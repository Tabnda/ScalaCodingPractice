package FunctionsAndTraits

object CartItemObject extends App {
  /**
  Write a Scala program and use a case class to represent a CartItem object that has a name
  property of type String, a quantity property of type Int, and a price property of type Double.
  Next, create a singleton object named ShoppingCart and define a totalCost() method that has
  two parameters - the first is the above CartItem type, and the second is a couponCode of type String,
  but which is optional. The return type of the totalCost() method will be a Double type.
  In the body of the totalCost() method, use pattern matching and apply a 10% discount to
  the total cost for a given CartItem for a coupon code of "COUPON_1234". If there is no couponCode
  parameter, then the total cost for a given CartItem will be basically the associated price of the
  CartItem multiplied by its quantity. Next, create an object, or instance, of the CarItem to
  represent a Chocolate item, with 10 quantity at a price of $2.50 each.
  Output:
  Calculating cost for Chocolate, quantity = 10
  Total cost without couponCode = $25.0
  Calculating cost for Chocolate, quantity = 10
  Total cost with couponCode = $22.5
  **/
  final case class CartItem(name : String, quantity : Int,price : Double)
  object ShoppingCart {
    def totalCost(cartItem: CartItem,couponCode : Option[String]) : Double =  {
      println(s"Calculating cost of ${cartItem.name} , ${cartItem.quantity}")

      couponCode match {
        case Some(coupon) =>
          val discount =  if (coupon == "COUPON_1234") 0.1 else 0.0
          val totalCost = cartItem.price * cartItem.quantity*(1-discount)
          totalCost

        case None => cartItem.price * cartItem.quantity
      }
    }

  }
  val chocolate =  CartItem("Chocolate",10,25.0)

  println(s"""Total cost without couponCode = $$${ShoppingCart.totalCost(chocolate, None)}""")
  println(s"""Total cost with couponCode = $$${ShoppingCart.totalCost(chocolate, Some("COUPON_1234"))}""")

}
