package FunctionsAndTraits

object DonutPastry extends App{
  /**
  Write a Scala program and use an abstract class to model a Donut pastry with a
  name property of type String, and having also a printName() method that does not have a
  return type. Use Scala's case class construct to define two sub-classes of the abstract Donut
  class to define two additional types, namely, a VanillaDonut, and a GlazedDonut.
  Next, create a class that accepts an upper type bound for a Donut type as its constructor argument.
  This particular Pastry class will further have a name() method that basically calls a given pastry's printName()
  method - that is of course derived from the upper type bound constraint that is applied to the Pastry's
  constructor argument. With the above classes defined, create two instances of Pastry, one with an upper
  type bound constraint of VanillaDonut, whereas the other, is bound to the abstract Donut type.
  You will have to respectively pass-through corresponding objects - that is, a VanillaDonut,
  and a GlazedDonut - to the two Pastry instances, and thereafter call the Pastry's name() method.
  Output:
  Vanilla Donut
  Glazed Donut
  **/
  abstract class DonutPastry(name : String) {
    def printName() : Unit
  }
  case class VanillaDonut(name: String) extends  DonutPastry(name) {
    override def printName(): Unit = println(name)
  }
  case class GlazedDonut(name : String) extends DonutPastry(name) {
    override def printName(): Unit = println(name)
  }
  val vanilla = VanillaDonut("Vanilla DONUT")
  val glazed = GlazedDonut("GLazed DONUT")
  class Pastry[P <: DonutPastry](Pastry:P) {
    def name(): Unit = Pastry.printName()
  }
  val VanillaPastry = new Pastry[VanillaDonut](vanilla)//upper class type constraint and other type of donut
  VanillaPastry.name()
  val glazedPastry = new Pastry[GlazedDonut](glazed)
  glazedPastry.name()

}
