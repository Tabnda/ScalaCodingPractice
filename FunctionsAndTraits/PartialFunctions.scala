package FunctionsAndTraits

object PartialFunctions extends App{
  /**
  Write a Scala program and define the following Partial Functions.
  The first will be called "nameIsJohn" and it will have a String input parameter,
  and will output true only for the String literal "John".
  This partial function will not have any other matching clauses.
  The second partial function will be called "nameIsJoe" and it will have a String input parameter,
  and will output true only for the String literal "Joe". Similar to the previous partial function,
  it will not have any other matching clauses. The third partial function will be called "nameIsJackOrJill"
  and it will output true for String literals of "Jack" or "Jill". Likewise to the previous partial functions,
  it will not have any other matching clauses. The final partial function will output false for all String inputs.
  Using the above-mentioned partial functions,
  combined them into a single partial function that match this particular type: PartialFunction[String, Boolean].
  Using the combined single partial function,
  test the following name inputs to produce the resulting output as shown below.
  Output:
  Name John is valid = true
  Name Jack is valid = true
  Name Bob is valid = false
  **/
  val nameIsJohn : PartialFunction[String,Boolean] = {
    case "John" => true
  }
  val nameIsJoe : PartialFunction[String,Boolean] = {
    case "Joe" => true
  }
  val nameIsJackorJill : PartialFunction[String,Boolean] = {
    case "Jack" | "Jill" => true
  }
  val invalidName : PartialFunction[String,Boolean] = {
    case _ => false
  }
  val nameValidator = nameIsJohn orElse nameIsJoe orElse nameIsJackorJill orElse invalidName
  println(s"Name John is valid = ${nameValidator("John")}")
  println(s"Name Joe is valid = ${nameValidator("Joe")}")
  println(s"Name bob is valid = ${nameValidator("bob")}")


}
