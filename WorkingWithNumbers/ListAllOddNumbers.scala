package WorkingWithNumbers

object ListAllOddNumbers extends App{
  /**
  Write a Scala program and list all the odd numbers between 300 and 350.
  As a tip, there is no need to manually create a data structure to represent all the number literals,
  such as, 300, 301, 302, etc. Instead, use the handy Range type to help you create number literals between
  300 and 350. As a second tip, experiment with the handy collection functions in Scala that can help you
  avoid boiler-plate code to solve this particular problem.
  Output:
  Odd number between 300 and 340 =
  301||303||305||307||309||311||313||315||317||319||321||323||325||327||329||331||333||335||337||339

  **/
  val oddNumbers = (300 to 350)
    .filter(_%2!=0)
    .take(20)
    .toList
    .mkString("||")

  println(s"Odd number between 300 and 340 = ${oddNumbers}")



}
