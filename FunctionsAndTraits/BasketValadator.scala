package FunctionsAndTraits

object BasketValadator extends App{
  /**
  Write a Scala program and create a class that will be called BasketValidator.
  This class will have a "validate" method that will accept an input "item" whose type need to be generic.
  The "validate" method should identify items of type String, Double and Int. For String types, it will output
  "Found a valid item = [the item]".
  For Double types, it will output: "Item [the item] of type Double is not valid".
  For Int types, it will output: "Item [the item] of type Int is not valid". For all other types,
  it should output: "Item [the item] should be removed from the basket.". Besides the "BasketValidator" class,
  you should also define its companion object, along with the relevant apply() method.
  You can use the following List data structure as your input to the above-mentioned
  "validate" method: List("Cupcake", 2.99, 100L, 7, "Ice Cream").
  Output:
  Found a valid item = Cupcake
  Item 2.99 of type Double is not valid.
  Item 100 should be removed from the basket.
  Item 7 of type Int is not valid.
  Found a valid item = Ice Cream
  **/
   class BasketValidator() {
    def validate[T](item : T) : Unit = {
          item match {
            case i : String => println(s"Found a valid item $i")
            case i : Double => println(s" $i of type Double is not valid")
            case i :Int => println(s" $i of type Int is not valid")
            case _ => println(s"${item} should be removed from the basket.")

          }

      }
  }
  object BasketValidator {
    def apply() : BasketValidator = new BasketValidator()
  }
  val basket = List("Fruits","Vegetables",10.5,5)
  basket.foreach(BasketValidator().validate(_))
}
