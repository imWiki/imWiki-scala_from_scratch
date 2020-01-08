package lectures.part2oops

object ObjectOrientedBasics extends App{
 val Person = new Person("Vignesh",28, "male")
  println(Person.gender)
}

class Person (name: String, age: Int, val gender: String) {
 // Class parameters are not accessible outside the class
 // Class fields are accessible outside the class ex: gender

  val someNumber = 50   //body of the class
  println(s"Class Initiated: ${someNumber+1}") //this print statement is part of side effect, meaning if class is invoked this statement will be executed and printed in console

  def greetingFunc(name: String) = println(s"Hello $name")
}