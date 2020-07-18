package exercises

object FifthExs extends App{

  val vignesh = new Person("Vignesh","Dosa", 28)
  val minu = new Person("Minu","Pasta", 28)
  val vigneshFullName = vignesh + " M"
  val vigneshNextYear= +vignesh

  println(vignesh + minu) // or vignesh.+(minu)
  println(vignesh.printAge)
  println(vigneshNextYear.printAge)
  println(vigneshFullName()) //equal to vignesh.apply()
  println(vignesh learns "Scala") //in-fix notation
  println(vignesh learnsPython) //post-fix notation
  println(vignesh("Briyani"))

  class Person(val name: String, food: String, age: Int = 1) {
    def learns(someVal: String) = s"${this.name} is learning $someVal"
    def learnsPython() = this learns "Python"

    def +(wife: Person) = s"${this.name} got married to ${wife.name}"
    def +(newName: String) = new Person(this.name + newName, this.food, this.age)

    def unary_! = s"It's Surprising ${this.name}"
    def unary_+ = new Person(this.name, this.food, this.age+1)

    def printAge = s"${this.name} age is ${this.age}"

    def isAlive() = s"${this.name} is Alive"

    def apply(): String = s"${this.name} likes ${this.food}"
    def apply(someVal: String) = s"${this.name} likes $someVal as well!"
  }
}
