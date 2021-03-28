package FunctionsAndTraits

object CaseClassStructure extends App{
  /**
  Write a Scala program and use a case class structure to represent the following students:
  (1) John who is 7 years old, (2) Jack who is 13 years old, (3) Joe who is 15 years old,
  (4) Jill who is 15 years old, and (5) James who is 11 years old. Use an appropriate data structure,
  and store the above-mentioned students. Next, write a recursive method that will walk-through your data
  structure and output true for the first student that is of 15 years old. If no students are found matching this
  particular criteria, the recursive function should return false.
  Output:
  Student(John,7)
  Student(Jack,13)
  Student(Joe,15)
  Student(Jill,15)
  Student(James,11)
  Is there a student who is 15 years old = true
  **/
  final case class Student(name: String, age: Int)
  val john = Student(name = "John",age =7)
  val jack = Student(name = "Jack",age =13)
  val joe = Student(name = "Joe",age =15)
  val jill = Student(name = "Jill",age =15)
  val james = Student(name = "James",age =11)

  val students = Vector(john, jack, joe, jill, james)
  println(students.mkString("\n"))
  //println(students.length)
  @annotation.tailrec
  def findStudentAge15(student: Student, students: Vector[Student], index: Int): Boolean = {
    if(students.length == index)
      false
    else if (students(index).age == student.age)
      true
    else
      findStudentAge15(student, students, index + 1)
  }


  val foundStudent = findStudentAge15(Student("", 15), students, 0)
  println(s"Is there a student who is 15 years old = $foundStudent")




}
