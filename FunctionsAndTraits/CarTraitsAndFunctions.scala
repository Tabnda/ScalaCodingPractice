package FunctionsAndTraits



object CarTraitsAndFunctions extends App {
  /***
   Write a Scala program and use an abstract class to model a Vehicle type with a name property.
  Using the Vehicle type as the base class, create two case classes, namely, Bike and Car,
  to model a given bike or car object, respectively. Next, use a trait with type parameters with a
  constraint to sub-classes of the Vehicle type and name it trait VehicleDatabaseService.
  This particular trait will act as the underlying feature to interact with some underlying storage layer and,
  as such, it will have the following methods: addOrUpdate(), get(), and remove(). Each of the aforementioned
  method will have as input a Vehicle type and with no return type. They should, however, be only visible to
  sub-types of the VehicleDatabaseService. Each of the methods should further simply output some print statements
  of its respective operations as per the output below. Then, create another trait named VehicleInventory that
  also has a type parameter constraint to sub-types of the Vehicle type. It further defines the following methods:
  create(), read(), update(), delete(), and each of the methods have a Vehicle type as input parameter,
  and with no return type. These methods will, however, not provide any implementation details. Next,
  create a class named VehicleInventory with a type parameter constrained to sub-types of the Vehicle type,
  and adds the features of the VehicleInventory and the VehicleDatabaseService traits. Its create(), read(),
  update(), and delete() methods should merely wire in the corresponding methods of the VehicleDatabaseService,
  such as, addOrUpdate(), get(), and remove(). Finally, create an object, or instance,
  of the VehicleInventorSystem and call the create(), read(), update(), and delete() methods by passing
  through a "bmw 3 series" car, "mazda 3 series" car, a "honda bike firestorm", and a "bmw bike r 2000".
  Output:
  Create vehicle = Car(bmw 3 series)
  Adding or updating vehicle = Car(bmw 3 series)
  Read vehicle = Car(mazda 3 series)
  Getting vehicle = Car(mazda 3 series)
  Update vehicle = Bike(honda bike firestorm)
  Adding or updating vehicle = Bike(honda bike firestorm)
  Delete vehicle = Bike(bmw bike r 2000)
  Removing vehicle = Bike(bmw bike r 2000)
  ***/
  abstract class Vehicle(name : String)
  case class Car(name : String) extends Vehicle(name)
  case class Bike(name : String) extends Vehicle(name)

  trait VehicleDatabaseService[V <: Vehicle] {
    def addOrUpdate(vehicle: V) : Unit = println(s"Creating or updating Vehicle ${vehicle}")
    def get(vehicle: V) : Unit = println(s"Getting the vehicle ${vehicle}")
    def remove(vehicle: V) : Unit = println(s"Removing the vehicle ${vehicle}")
  }
  trait VehicleInventory[V <: Vehicle] {
    def create(vehicle: V) : Unit
    def read(vehicle: V) : Unit
    def update(vehicle: V) : Unit
    def delete(vehicle: V) : Unit
  }
  class VehicleInventorySystem[V <: Vehicle] extends VehicleInventory[V] with VehicleDatabaseService[V] {
    override def create(vehicle : V) : Unit = {
      println(s"Create Vehicle = ${vehicle}")
      addOrUpdate(vehicle)
    }

    override def read(vehicle : V) : Unit = {
      println(s"Read Vehicle = ${vehicle}")
      get(vehicle)
    }
    override def update(vehicle : V) : Unit = {
      println(s"Create Vehicle = ${vehicle}")
      addOrUpdate(vehicle)
    }
    override def delete(vehicle : V) : Unit = {
      println(s"Create Vehicle = ${vehicle}")
      remove(vehicle)
    }
  }

  val VehicleinvSys = new VehicleInventorySystem[Vehicle]()
  VehicleinvSys.create(Car("bmw 3 series"))
  VehicleinvSys.read(Car("mazda 3 series"))
  VehicleinvSys.update(Bike("honda bike firestorm"))
  VehicleinvSys.delete(Bike("bmw bike r 2000"))

}
