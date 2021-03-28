package FunctionsAndTraits

object CaseClassExample extends App{
  /**
  Write a Scala program and use a case class to represent a
  Student with a name property of type String, an age property of type Int, and an optional favoriteSnack
  property of type String. Use the above case class and create the following student objects:
- Jack who is 15 years old and whose favorite snack is cupcake.
- Jill who is 10 years old and whose favorite snack is ice cream.
- Joe who is 7 years old and whose favorite snack is nothing!
- James who is 10 years old and whose favorite snack is chocolate.
- John who is 11 years old and whose favorite snack is nothing!
The student Joe now wants to add his favorite snack and it is a cupcake. Next, define a method named
  listStudents that will have input a List of Student types and output the details of each students as shown below.
  You should of course also create a List data structure to store the above-mentioned students.
Output:
name = Jack is 15 years old. Favorite snack is cupcake
name = Jill is 10 years old. Favorite snack is ice cream
name = Joe is 7 years old. Favorite snack is cupcake
name = James is 10 years old. Favorite snack is chocolate
name = John is 11 years old. Favorite snack is nothing!
  **/
  case class student(name : String,age : Int,favoriteSnack : Option[String] = None)
  val jack =  student("Jack",15,Some("cupcake"))
  val jill =  student("Jill",10,Some("ice cream"))
  val joe =  student("Joe",7,None)
  val james =  student("James",10,Some("chocolate"))
  val john =  student("John",11,None)
  //val list = List(jack,jill,joe,james,john)

  val joeUpdated = joe.copy(favoriteSnack = Some("cupcake"))


    def listStudents(students : List[student]) : Unit = {
      students.foreach{ Student =>
        print(s"name = ${Student.name} is ${Student.age} years old. ")
        print(s"Favourite snack is ${Student.favoriteSnack}")
        //println("/n")
    }
  }
  listStudents(List(jack,jill,joe,james,john))


}
