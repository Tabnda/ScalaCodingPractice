package FunctionsAndTraits

object AbstractClass extends App{
  /**
  Write a Scala program and use an abstract class to define a student that is
  required to have a name of type String, and an age of type Int. Each Student
  type should also have a printName() method with Unit as the return type.
  Thereafter create two sub classes of the Student class, namely, a PrimaryStudent, and a SecondaryStudent.
  Each sub class should provide its own implementation of the printName() method.
  You should also define the respective companion objects for the PrimaryStudent and the SecondaryStudent types.
  Next, create the following students:
- John who is a primary student and is 8 years old.
- Jill who is a primary student and is 10 years old.
- James who is a secondary student and is 13 years old.
- Joe who is a secondary student and is 14 years old.
- Jack who is a secondary student and is 11 years old.
Next, use an appropriate data structure to store the above-mentioned students. And, create a method name listStudents that will have input your collection of students and call the printName() name for each one.
Output:
name = Jill, age = 10
name = John, age = 8
name = Jack, age = 11
name = James, age = 13
name = Joe, age = 14
  **/
  abstract class student(name: String, age :Int) {
    def PrintName():Unit
  }
  class PrimaryStudent(name: String, age :Int) extends student(name, age) {
  override def PrintName(): Unit = println(s"name = $name, age = $age")
  }
  object PrimaryStudent {
    def apply(name: String, age: Int): PrimaryStudent = new PrimaryStudent(name, age)
  }
  class SecondaryStudent(name: String, age :Int) extends student(name, age) {
    override def PrintName(): Unit = println(s"name = $name, age = $age")
  }
  object SecondaryStudent {
    def apply(name : String,age:Int) : SecondaryStudent = new SecondaryStudent(name,age)
  }
  val pStudentjohn = PrimaryStudent("John",10)
  val pStudentjill = PrimaryStudent("Jill",8)
  val pStudentjack = SecondaryStudent("Jack",11)
  val pStudentjames = SecondaryStudent("James",13)
  val pStudentjoe = SecondaryStudent("Joe",14)

  val list = List(pStudentjohn,pStudentjill,pStudentjack,pStudentjames,pStudentjoe)
  def ListStudents(students : List[student]) : Unit = {
    students.foreach(student => student.PrintName())
  }
  ListStudents(list)
}
