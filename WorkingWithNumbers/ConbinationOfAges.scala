package WorkingWithNumbers

object ConbinationOfAges extends App{
  /**
  Write a Scala program and use a Sequence data structure to store a combination
  of names to ages as follows:
Seq(
"James", 7,
"Andy", 8,
"Tommy", 10,
"Bob", 13,
"Sam", 10
)
Note that the above elements are not in a key value pair format. They are instead in a comma
  separated format within the Sequence. From the above Sequence, extract the age number literal,
  and use this to find the sum of ages.
Output:
Combined sequence of names to ages = James,7,Andy,8,Tommy,10,Bob,13,Sam,10
Sum of ages = 48

  **/
    val nameAndAge = Seq(
      "James", 7,
      "Andy", 8,
      "Tommy", 10,
      "Bob", 13,
      "Sam", 10
    )
 val ageSequence = nameAndAge.collect{
   case age : Int => age
 }
  println(s"Combined sequence of names to ages = ${nameAndAge}")
  println(s"Sum of ages ${ageSequence.sum}")
}
