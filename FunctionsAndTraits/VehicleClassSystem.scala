package FunctionsAndTraits

object VehicleClassSystem extends App {
  /****
    Write a Scala program that will model a basic Vehicle class system,
  or type hierarchy, as per the previous Scala exercise. More precisely,
  you will have a base trait for a Vehicle type and with an abstract printName() method.
  The Vehicle type has two sub-classes, namely, a Car, and a Bike.
  The Car type itself has two further subsequent sub-types, namely, a BmwCar and a MazdaCar.
  Likewise, the Bike type has two sub-classes, namely, a HondaBike, and a BmwBike.
  Modify the VehicleMaker class from the previous Scala exercise, and make its constructor
  argument optional, and do remember that the VehicleMaker had a type parameter with a
  constraint to the Vehicle type. In the VehicleMaker class, create a method named
  makeSimilarCars that will have as input parameters two vehicles whose types are of
  course derived from the Vehicle type constraint. In addition, this particular
  makeSimilarCars() method, as its name implies, should only accept objects that are of
  the same types - for instance, you could pass-through two BmwCar objects, and not a
  BmwCar along with a HondaBike. In addition, create another method named makeBikes()
  that also has two input parameters for two Vehicle types. As its name implies, though,
  this particular method will accept objects, say, a HondaBike with a BmwBike. As a hint to
  creating the makeSimilarCars() and the makeBikes() methods, you will need to lift some
  types into scope and generalize type constraints for the arguments using Scala's built-in
  implicit evidence features.
  Output:
  Making two CAR vehicles:
  vehicleA = bmw car 3 series
  vehicleB = bmw car 5 series
  Making two BIKE vehicles:
  vehicleA = honda bike firestorm
  vehicleB = bmw bike r 2000
  ***/
  trait Vehicle {
    def printName() : Unit
  }
  class Car(name : String) extends Vehicle {
    override def printName() : Unit = println(name)
  }
  class Bike(name : String) extends Vehicle {
    override def printName() : Unit = println(name)
  }
  class BmwCar(name : String) extends Car(name) {
    override def printName() : Unit = println(name)
  }
  class MazdaCar(name : String) extends Car(name) {
    override def printName() : Unit = println(name)
  }
  class HondaBike(name : String) extends Bike(name) {
    override def printName() : Unit = println(name)
  }
  class BmwBike(name : String) extends Bike(name) {
    override def printName() : Unit = println(name)
  }
  class VehicleMaker[V <: Vehicle](val vehicle: Option[V] = None) {
    def make(): Option[V] = { //its constructor argument is optional
      println("Make Vehicle = ")
      vehicle.map { v =>
        v.printName()
        v
      }
    }

    def makeSimilarCars[A <: V, B <: V](vehicleA: A, vehicleB: B)(implicit ev: A =:= B): Unit = {
      println("Making two CAR vehicles: ")
      println("VehicleA = ")
      vehicleA.printName()
      println("VehicleB = ")
      vehicleB.printName()
    }
    def makeBikes[A <: V, B <: V](vehicleA: A, vehicleB: B)(implicit ev: A <:< B): Unit = {
      println("Making two BIKE vehicles: ")
      println("VehicleA = ")
      vehicleA.printName()
      println("VehicleB = ")
      vehicleB.printName()
    }
  }

  val bmwCar = new BmwCar("bmw car 3 series")
  val bmwCar5 = new BmwCar("bmw car 5 series")
  val hondaBike = new HondaBike("honda bike firestorm")
  val bmwBike = new BmwBike("bmw bike r 2000")

  val carList = List(bmwCar,bmwCar5)
  val bikeList = List(hondaBike,bmwBike)

  val obj = new VehicleMaker[Vehicle]()
  obj.makeSimilarCars(bmwCar,bmwCar5)
  //obj.makeBikes(hondaBike,bmwBike)
  //new VehicleMaker[Vehicle]().makeBikes(hondaBike,bmwBike)
}
