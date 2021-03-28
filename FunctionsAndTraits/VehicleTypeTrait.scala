package FunctionsAndTraits

object VehicleTypeTrait extends App{
  /***
   Write a Scala program and use a case class to represent a Vehicle type with a name property.
  Define a trait named VehicleInventory that will define the methods only - that is,
  without any implementations - for typical Create, Read, Update, and Delete (CRUD) methods nsmed
  create(), read() update(), and delete(). Each of the aforementioned methods will have as input
  parameter a Vehicle type, and will have no return type. Next, extend the VehicleInventory trait
  with a class named VehicleInventorySystem that will, of course, provide implementation details
  to the create(), read(), update(), and delete() methods from the VehicleInventory trait. Then,
  create an object, or instance, of the Vehicle type for a "bmw car 5 series", along with an object,
  or instance, of the VehicleInventorySystem, and pass-through the Vehicle object to the create(),
  read(), update(), and delete() methods of the VehicleInventorySystem object.
  Output:
  Create vehicle = Vehicle(bmw car 5 series)
  Read vehicle = Vehicle(bmw car 5 series)
  Update vehicle = Vehicle(bmw car 5 series)
  Delete vehicle = Vehicle(bmw car 5 series)
  ***/
  case class VehicleType(name : String)
  trait VehicleInventory {
    def create(vehicleType: VehicleType) : Unit
    def read(vehicleType: VehicleType) : Unit
    def update(vehicleType: VehicleType) : Unit
    def delete(vehicleType: VehicleType) : Unit
  }
  class VehicleInventorySystem extends  VehicleInventory {
    override def create(vehicletype: VehicleType) : Unit = {
      println(s"Create vehicle = $vehicletype")
    }
    override def read(vehicletype: VehicleType) : Unit = {
      println(s"Read vehicle = $vehicletype")
    }
    override def update(vehicletype: VehicleType) : Unit = {
      println(s"Update vehicle = $vehicletype")
    }
    override def delete(vehicletype: VehicleType) : Unit = {
      println(s"Delete vehicle = $vehicletype")
    }
  }
  val vehicle = VehicleType("bmw car 5 series")
  val vehicleCarInventory = new VehicleInventorySystem()
  vehicleCarInventory.create(vehicle)
  vehicleCarInventory.read(vehicle)
  vehicleCarInventory.update(vehicle)
  vehicleCarInventory.delete(vehicle)


}
