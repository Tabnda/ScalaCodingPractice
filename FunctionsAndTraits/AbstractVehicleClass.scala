package FunctionsAndTraits

object AbstractVehicleClass extends App{
  /***
  Write a Scala program that defines a base abstract class to model a
  Vehicle type that has a public make property of type String. This particular Vehicle
  base class will be extended by two sub-types, namely, a Car, and a Bike, case class,
  and will wire accordingly the make property of type String from the Vehicle base class.
  Next, create a singleton object named VehicleReport that will define a printVehicles method that
  will have as input a List of Vehicle types, and any of its sub-types or sub-classes. The printVehicles()
  method will simply iterate through each of the Vehicle type and output its corresponding make property.
  Note that the printVehicles() method will have no return type defined as such. You can use the following
  vehicle samples to model your data points:
  a car whose make is: bmw 3 series
  a car whose make is: vw golf
  a bike whose make is: bmw g 310 r bike
  a bike whose make is: fire storm bike
  Use the List data structure from Scala's collection type and store the above-mentioned vehicles.
  And, finally, call the VehicleReport's printVehicles() method by passing through your collection of
  vehicles as defined above.
  Output:
  bmw 3 series
  vw golf
  bmw g 310 r bike
  fire storm bike
  ***/
   abstract class Vehicle(val make : String)
   case class Car(override val make: String) extends Vehicle(make)
   case class Bike(override val make: String) extends  Vehicle(make)


  object VehicleReport {
    def printVehicles[V <: Vehicle](vehicles: List[V]): Unit = { //Generic--inputs list of vehicle type and any of its subtypes or subclasses
      vehicles.foreach(v => println(v.make))
    }
  }
  val bmw3 = new Car("bmw 3 series")
  val vwgulf = new Car("vw golf")
  val bmwg = new Bike("bmw g 310 r bike")
  val firestorm = new Bike("fire storm bike")

  val collections = List(bmw3,vwgulf,bmwg,firestorm)
  VehicleReport.printVehicles(collections)


}
