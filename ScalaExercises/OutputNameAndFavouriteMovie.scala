package ScalaExercises

import scala.io.StdIn.readLine


object OutputNameAndFavouriteMovie extends App{
/**Create a Scala program to output your name and favorite movie.
Output:
First Name: Nadim
Last Name: Bahadoor
Favorite Movie: The Matrix**/

  val FirstName = readLine("What is your First Name?")
  val LastName = readLine("What is your Last Name?")
  val FavMovie = readLine("What is your Favourite Movie?")
  val tojson =
    """
      |{
      |"FirstName" : $"FirstName"
      |"LastName" : $"LastName"
      |"FavMovie" : $"FavMovie"
      |}
      |""".stripMargin

  print(tojson)


}
