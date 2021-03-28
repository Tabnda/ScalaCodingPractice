//package ScalaExercises

//import scala.collection.immutable.TreeMap
//import scala.collection.mutable
//import scala.collection.mutable.RedBlackTree.Tree

/**Create a Scala program and use an appropriate data structure to present the following key and
 * value pairs of children and their ages: Bill is 9 years old, Jonny is 8 years old, Tommy is 11 years old,
 * and Cindy is 13 years old.
 * Sort out the corresponding child to age in reverse alphabet order.**/

/**object KeyValuePairs extends App {
  def compare(key1: String, key2: String) = key2.compareTo(key1)


  val ChildrenToAges = TreeMap(
      ("Bill", 9)
      ("Cindy", 13)
      ("Jonny", 8)
      ("Tommy", 11)
  )(ReverseAlphaOrder)
  println(s"Children to ages in reverse order by their names = ${ChildrenToAges.mkString(", ")}")

}**/

