package lectures.part2oops

object MethodNotations extends App{

  val vignesh = new Person("Vignesh","Dosa")
  val kavin = new Person("Kavin", "Chicken")
  val minu = new Person("Minu","Pasta")

  //Below are Syntactic Sugar notations which is offered in Scala
  //In-Fix or "Operator" Notations
  println(vignesh.likes("Idly")) //this can be written as below without any brackets or dots,
  println(vignesh likes "Dosa") //but only for methods with single argument
  println(vignesh hangsOutWith kavin) //here method hangsOutWith acts like an operator between two objects
  println(vignesh & kavin) //both of current and above statement will work the same way
  println(vignesh + minu) // or vignesh.+(minu)

  //examples below

  println( 1 + 2 ) //is same as,
  println(1.+(2))

  //Pre-fix notation (Ex: Unary Operators)
  val x = -1 // is same as val x = 1.unary_-, this unary_ works with -, !, +, ~
  println(!vignesh) //now this will automatically call unary_! method inside the class and its same as calling vignesh.unary_!()

  //Post-Fix Notation - Works only on methods with no arguments
  println(vignesh isAlive) //but this might confuse and introduce ambiguity to developers reading the code particularly post-fix notations.

  //apply method - default method that compiler will execute when class is called with ()
  println(vignesh()) //equal to vignesh.apply()

  class Person(val name: String, food: String) {
    def likes(favFood: String) = favFood == food
    def hangsOutWith(anotherPerson: Person) = s"${this.name} hangs out with ${anotherPerson.name}"

    //Every Operator like + - * / are METHODS in Scala, we can write above method with below names as well,

    def &(anotherPerson: Person) = s"${this.name} hangs out with ${anotherPerson.name}"
    def +(wifeName: Person) = s"${this.name} got married to ${wifeName.name}"

    def unary_! = s"It's Surprising ${this.name}"

    def isAlive() = s"${this.name} is Alive"

    def apply(): String = s"${this.name} likes ${this.food}"
  }
}
