package FunctionsAndTraits

object toupperfunction extends App{
  /**
  Write a Scala program which defines a method named
  "toUpper" and it accepts a String as input parameter that is then formatted to upper case as output.
  Define another method named "toLower" which accepts a String as input parameter and formats the input to lower
  case as output. Define another method named "formatNames" which also has an input String called "name".
  This method however has a parameter group which accepts a functions with an input of type String and also
  outputs a String. This particular function will be used to apply the given format to the "name" input.
  You can use the test inputs for, say, "Bob", "Joe", and "Jack", and make sure that the output is as shown below.
  Output:
  BOB
 joe
 JACK
  **/
  def toupper(name: String) : String = {
    name.toUpperCase()
  }
  def tolower(name: String) : String ={
    name.toLowerCase()
  }
  def formatNames(name:String)(f : String => String ) : String = {
   f(name)
  }
  println(formatNames("bob")(toupper(_)))
  println(formatNames("JOE")(tolower(_)))
  println(formatNames("jack")(toupper(_)))

}
