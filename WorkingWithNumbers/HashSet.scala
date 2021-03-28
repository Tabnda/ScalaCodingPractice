package WorkingWithNumbers

object HashSet extends App{
  /**
  Let us assume two data structures to represent the following numerals:
  (1) 1, 3, 5, 10, 20 and (2) 20, 17, 18, 99, 0.
  Write a Scala program to find the number literals that are in the first data structure,
  but not in the other one. Conversely, also find the number literals that are in the second data structure,
  but not in the first one. You can use whichever data structure from the standard Scala collection types.
Output:
Number literals in set one but not in set two = HashSet(5, 10, 1, 3)
Number literals in set two but not in set one = HashSet(0, 17, 18, 99)

  **/
  val structure1 = Set(1,3,5,10,20)
  val structure2 = Set(20,17,18,99,0)
  val diffInOneVsTwo = structure1 -- structure2
  val diffInTwoVsOne = structure2 -- structure1
  println(s"Number literals in set one but not in set two = ${diffInOneVsTwo}")
  println(s"Number literals in set two but not in set one = ${diffInTwoVsOne}")

}
