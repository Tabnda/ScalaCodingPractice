package ScalaExercises

object Stationary extends App{
  /**
  Write a Scala program and create two Lists data structures as follows: (1) The first List will have items
  named "pencil", "pen", "sharpener", and (2)
  The second List will have items name "math book", "french book", "english book". Merge the two List
  data structures such that the resulting combined data structure is of type List[List[String]]. Finally,
  output all items with the literal " is required in the classroom.".
  Output:
  pencil is required in the classroom.
  pen is required in the classroom.
  sharpener is required in the classroom.
  math book is required in the classroom.
  french book is required in the classroom.
  english book is required in the classroom.

  **/
  val list1 = List("pencil","pen","Sharpner")
  val list2 = List("math book","french book","english book")
  val combinedList : List[List[String]] = List(list1,list2)
  combinedList.flatten.map(_ + "is required in the classroom")
    .foreach(println(_))

}
