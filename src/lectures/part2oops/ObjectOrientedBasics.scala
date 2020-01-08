package lectures.part2oops

object ObjectOrientedBasics extends App{
 val Person = new Person("Vignesh",28, "male")
  println(Person.gender + ", Dummy Parameter:" + Person.dummy)
  Person.greetingFunc("Kavin")
  Person.greetingFunc() //method overloading with different set of parameter list.

}

class Person (name: String, age: Int, val gender: String, val dummy: Int = 0) {

  /* Class parameters are not accessible outside the class
   * Class fields are accessible outside the class ex: gender
   * Class parameters also allow default values
   */

  val someNumber = 50   //body of the class
  println(s"Class Initiated: ${someNumber+1}") //this print statement is part of side effect, meaning if class is invoked this statement will be executed and printed in console

  //method definitions inside a class
  def greetingFunc(name: String) = println(s"${this.name} says: Welcome, $name") //'this' will invoke class parameter here instead of method argument

  //method overloading
  def greetingFunc() = println(s"Hi, $name, your age is $age") //here name is class parameter as method doesn't have any overloaded parameter

  /* overloading can be done with different list of parameter or different data types of parameter with different return types
  * only keeping different return types will not work, compiler will throw error if you uncomment below method
  */

  //def greetingFunc(): String = "Let's see if it works"

}