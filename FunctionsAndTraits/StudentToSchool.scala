package FunctionsAndTraits

object StudentToSchool extends App{
  /***
   Write a Scala program that will model a very basic student to school abstract data type. For instance,
  define a base abstract class named Student with a name property of type String, and an age property of type
  Int. This particular base class should also define the method signature for a method named studentId() that
  will have no return type, and no implementation, as the actual implementation details will be left to the
  subsequent sub-classes. As such, create two sub-classes of the Student abstract class, namely,
  a PrimarySchoolStudent, and a SecondarySchoolStudent, and you can conveniently use a case class to represent
  these two sub-classes. Next, create a class named PrimarySchool that has a constructor input parameter for a
  List of students and should also further restrict and accept only List items that are derived from the
  abstract Student class. For your Scala program, you can thereafter define the following students, and while
  explicitly defining their types:
  Jill is a primary school student of 8 years old and whose type should be the PrimarySchoolStudent class.
  Joe is a primary school student of 7 years old and whose type should be the PrimarySchoolStudent class.
  Jack is a secondary school student of 15 years old and whose type should be the SecondarySchoolStudent class.
  James is a secondary school student of 10 years old and whose type should be the SecondarySchoolStudent class.
  John is a secondary school student of 11 years old and whose type should be the SecondarySchoolStudent class.
  Use a List data structure from Scala's collection type to store the above students. Next, create an instance
  of the School class and call its printStudents() method that will output both the primary and secondary
  students. As a hint or tip, you should keep in mind that the type parameter for the School class should make
  use of Scala's built-in variance features in order to restrict only types and sub-types of the abstract
  Student class.
  Output:
  [SecondarySchoolStudent] - name: Jack - age: 15
  [SecondarySchoolStudent] - name: James - age: 10
  [SecondarySchoolStudent] - name: John - age: 11
  [PrimarySchoolStudent] - name: Jill - age: 8
  [PrimarySchoolStudent] - name: Joe - age: 7
  ***/

  abstract class Student(name : String, age : Int){
    def studentId() : Unit
  }

  case class PrimarySchoolStudent(name : String, age : Int) extends Student(name , age )  {
    override def studentId() : Unit = {
      println(s"${this.getClass.getSimpleName} - name: ${name} - age: ${age}")
    }
  }
  case class SecondarySchoolStudent(name : String, age : Int) extends Student(name , age )  {
    override def studentId() : Unit = {
      println(s"${this.getClass.getSimpleName} - name: ${name} - age: ${age}")
    }
  }

  class School[+S <: Student](students: List[S]) {
    def printStudents(): Unit = {
      students.foreach(_.studentId())
    }
  }

  val jill: PrimarySchoolStudent = PrimarySchoolStudent("Jill", 8)
  val joe: PrimarySchoolStudent = PrimarySchoolStudent("Joe", 7)
  val jack: SecondarySchoolStudent = SecondarySchoolStudent("Jack", 15)
  val james: Student = SecondarySchoolStudent("James", 10)
  val john: Student = SecondarySchoolStudent("John", 11)

  val students = List(jack, james, john, jill, joe)
  val primarySchool = new School(students)
  primarySchool.printStudents()

}
