package FunctionsAndTraits

object LollipopType extends App {
  /**
  Write a Scala program and use a case class to model a Lollipop type with a name property of type String.
  Thereafter, create an object, or instance, of the Lollipop type.
  Using the types from the previous scala exercises - that is, the Donut, VanillaDonut, GlazedDonut,
  and Pastry classes - try to define a Pastry object that has an upper type bound to the Lollipop type.
  What you will observe is that given the upper type bound constraint of P <: Donut on the Pastry type's
  constructor argument, you will receive a compile time error because a Pastry of type Lollipop does not
  match P <: Donut - in other words, a Lollipop is not a sub-type of the base Donut type. Next, create a
  ShoppingCart class that has an addCartItem() method with a parameter named item that is represented as
  a lower type bound with respect to the earlier VanillaDonut type. The method should have no return type,
  but will output the following details regarding the item parameter. The output below is obviously the
  result of creating an object, or instance, of the ShoppingCart class and calling the addCartItem()
  multiple times with values of VanillaDonut, GlazedDonut, Lollipop, and a String.
  The String is of course to illustrate the point that you have to understand the lower type bound
  constraint, and determine that it is right for your particular use case. In other words, unlike upper
  type bounds, the lower type bounds may be too unrestrictive, such as in the example below, where we are
  able to pass-through a String value to the addCartItem() method.
  Output:
  Adding VanillaDonut(Vanilla Donut) to shopping cart
  VanillaDonut
  Adding GlazedDonut(Glazed Donut) to shopping cart
  GlazedDonut
  Adding Lollipop(Lollipop) to shopping cart
  Lollipop
  Adding oops something is not right! to shopping cart
  String
  **/
  abstract class Donut(name : String) {
    def printName() : Unit
  }
  case class VanillaDonut(name : String) extends Donut(name) {
    def printName(): Unit = println(name)
  }
  case class GlazedDonut(name : String) extends Donut(name) {
    def printName() : Unit = println(name)
  }
  val vanilla = VanillaDonut("Vanilla Donut")
  val glazed = GlazedDonut("Glazed Donut")

  case class Pastry[V <: Donut](pastry : V){ //upper bound item
   def name() : Unit = pastry.printName()
  }
  val vanillaPastry = new Pastry[VanillaDonut](vanilla)
  vanillaPastry.name

  val glazedPastry = new Pastry[GlazedDonut](glazed)
  glazedPastry.name

  case class lollipop(name : String)
  val loli = new lollipop("Lollipop ")

  class shoppingCart {
    def addCartItem[P >: VanillaDonut](item : P): Unit = { //lower bound item
      println(s"Adding $item to the shopping cart.")
      println(item.getClass.getSimpleName)
    }
  }
  val soppingcart = new shoppingCart()
  soppingcart.addCartItem(vanilla)
  soppingcart.addCartItem(glazed)
  soppingcart.addCartItem(loli)
  soppingcart.addCartItem("Ooops..Something is not right")


}
