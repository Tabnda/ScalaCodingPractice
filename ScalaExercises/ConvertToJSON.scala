package ScalaExercises
//Create a Scala program to output the following basic JSON notation.
//Output:
//{
//"donut_name":"Vanilla Donut",
//"quantity_purchased":"10",
//"price":2.5
//}
object ConvertToJSON extends App{

  val donut_name = "Vanilla Donut"
  val qualty_purchased = 10
  val price = 2.5
  val donutJason =
    """
      |{
      |"donut_name" : "$donut_name"
      |"quality_purchased" : "$qualty_purchased"
      |"price" : "$price"
      |}
      s""".stripMargin

  println(donutJason)
}
