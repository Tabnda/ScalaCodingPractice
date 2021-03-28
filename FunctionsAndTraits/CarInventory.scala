package FunctionsAndTraits

object CarInventory extends App{
  /**
  Write a Scala program to simulate a very basic car inventory.
  In doing so, use a case class to represent a Car type that needs to have a name property of type String,
  and a price property of type Double.
  Thereafter you should define an aliased type named CarStock that will in effect, alias,
  Scala's Tuple2 type and represent a tuple or pair of Car and Int.
  The former is obviously the above-mentioned Car type, and the Int type represents the current stock inventory
  for a particular Car item. You should then define a create the following car stock items, and use an
  appropriate data structure from Scala's Collection types.
- a vw passat with price of 10,000 and stock of 100
- a vw golf with price of 12,000 and stock of 50
- a bmw 3 series with price of 20,000 and stock of 200
- a bmw 5 series with price of 50,000 and stock of 75
- a mazda 3 series with price of 15,000 and stock of 49
Create a method named orderByLowestStock which will have as input the Collection data structure of cars to stock,
  and will order the car items from the collection by the lowest or minimum stock quantity.
Output:

Cars sorted by lowest stock:
mazda 3 stock = 49
vw golf stock = 50
bmw 5 series stock = 75
vw passat stock = 100
bmw 3 series stock = 200

  **/

  final case class Car(name : String, price : Double)
  type CarStock = Tuple2[Car, Int]
  val vwpassatstock = new CarStock(Car("vw passat",10000),100)
  val vwgolfstock = new CarStock(Car("vw golf",12000),50)
  val vwbmw3stock = new CarStock(Car("vw bmw 3 series",20000),200)
  val vwbmw5stock = new CarStock(Car("vw bmw 5 series",50000),75)
  val vwmazdastock = new CarStock(Car("mazda 3",15000),49)

  val carInventory = List(vwpassatstock,vwgolfstock,vwbmw3stock,vwbmw5stock,vwmazdastock)

  def orderByLowestStock(inventory: List[CarStock]) : Unit = {
    inventory.sortBy(_._2).foreach{
      case (car, stock) => println(s"${car.name} stock = ${stock}")
    }
  }
  println("Cars sorted by lowest stock")
  orderByLowestStock(carInventory)

}
