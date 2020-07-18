package lectures.part2oops

object Objects /*extends App*/ {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY, No static variables concept here.
  object Person { //type + it's own instance is defined here
    // Static class-level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person = new Person("Factory_Father")
  }

  //having object and class in same name and same scope are Companions
  class Person(val name: String) {
    // Instance-level functionality
  }

  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    // Scala objects are singleton instances

    val mary = Person //Accessing singleton object
    val john = Person

    println(mary == john) // This will return true because both the instances are referring to same object

    val mary_c = new Person("Mary") //Creating new object for the class Person
    val john_c = new Person("John")

    println(mary_c == john_c) // This will return false because both the instances are referring to new object

    val tester = Person(mary_c, john_c) //Call the factory apply method

    println(tester.name)

    //Scala Applications - Scala object with
    // def main(args: Array[Strings]): Unit
    // Replaced extends App with main method and code will now run
  }
}
