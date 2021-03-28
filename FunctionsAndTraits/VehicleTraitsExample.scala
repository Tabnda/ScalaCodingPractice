package FunctionsAndTraits

object VehicleTraitsExample extends App {
  /***
   Write a Scala program and use a trait to define a Vehicle type with an abstract method named
  printName() that has no return type. Using this new Vehicle type, create a new class named
  Car with a name property of type String that is a sub-class of the former Vehicle type.
  Likewise, use this new Car type to create two subsequent classes, namely, a BmwCar, and a
  MazdaCar class. In addition, create a new type named Bike with a name property of type String
  that is a sub-class of the Vehicle trait. Using this new Bike class, create two further
  sub-classes, namely, a HondaBike, and a BmwBike, class. Next, create a class named VehicleMaker
  which has a type parameter V that acts as a constraint to the Vehicle type, and therefore,
  also has a vehicle of type V as its constructor argument. The VehicleMaker class should
  have a make() method with a generic return type V - that is, of course, based from and
  relative to its class type parameter. In the body of the make() method, you can simply access
  and call the printName() method for a given Vehicle type. With the above defined and in scope,
  use a List data structure to create a "bmw car 5 series" and a "mazda car 3 series".
  Similarly, create another List data structure with a "honda bike firestorm" and a
  "bmw bike r 2000". Thereafter, merge the two List data structures into a single one and use
  Scala's built-in map() method to call the VehicleMaker's make() method for each vehicle in the
  List.
  Output:
  Making vehicle = bmw car 5 series
  Making vehicle = mazda car 3 series
  Making vehicle = honda bike firestorm
  Making vehicle = bmw bike r 2000
  ***/
  trait Vehicle {
     def printName() : Unit
  }
   class Car(name : String) extends Vehicle {
     override def printName(): Unit = println(name)
  }

  class BmwCar(name : String) extends Car(name) {
    override def printName(): Unit = println(name)
  }
  class MazdaCar(name : String) extends Car(name) {
    override def printName(): Unit = println(name)
  }
  class Bike(name : String) extends Vehicle {
    override def printName(): Unit = println(name)
  }
  class HondaBike(name : String) extends Bike(name) {
    override def printName(): Unit = println(name)
  }
  class BmwBike(name : String) extends Bike(name){
    override def printName(): Unit = println(name)
  }
  class VehicleMaker[V <: Vehicle](val vehicle: V){ //type parameter V that acts as a constraint to VehicleType
    def make() : V =  {
      println("Making Vehicle = ")
      vehicle.printName
      vehicle
    }                              //also has vehicle type v as constructor parameter
  }
  val bmwCar = new BmwCar("bmw car 5 series")
  val mazcar = new MazdaCar("mazda car 3 series")
  val hond = new HondaBike("honda bike firestorm")
  val bmwbike = new BmwBike("bmw bike r 2000")

  val vehiclesToMake = List(bmwCar,mazcar,hond,bmwbike)
  vehiclesToMake.map { v =>
    new VehicleMaker[Vehicle](v).make()

  }



}
