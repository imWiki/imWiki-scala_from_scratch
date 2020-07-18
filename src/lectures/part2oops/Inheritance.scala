package lectures.part2oops

object Inheritance extends App{
  class Animal {
    val creatureType = "Wild"
    def eat = println("Grass") //public
    protected def digest = println("Digested")
    private def hide = println("This method is private, cannot be accessed outside the scope of this class")
    final def preventOverride = println("This method is prevented from overriding")
  }

  class Cat extends Animal {
    def catDigest = digest
  }

  val cat = new Cat
  cat.eat //Inherits only one class & non private members, if eat method is marked private, it will not be accesible here.
  cat.catDigest //protected methods can be accessed within extended sub-class but not outside or with objects created for the subclass
  //cat.digest will throw error
  println(cat.creatureType)


  //constructors

  class Person(name: String, age: Int) {
    def this (name: String) = this( name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age) //extending this class needs parameter name as JVM needs it
  //age can also be initialised here or from auxiliary constructor "this" which is defined in person

  // over riding methods in parent class needs override identifier
  class Dog(creatureTypeArg: String) extends Animal {
    override val creatureType = creatureTypeArg
    override def eat = println("Crunchy Crunchy")
  }

  val dog = new Dog("Pet")
  dog.eat
  println(dog.creatureType)

  // type substitution / polymorphism
  // Though the val here is of type "Animal" it will use overridden methods from Dog as this is being instantiated with Dog
  val unknownAnimal: Animal = new Dog("Substitute")
  unknownAnimal.eat //This will use Dog's eat method. Not Animal's eat
  println(unknownAnimal.creatureType)

  // overRIDING - Different implementation in derived classes
  // vs
  // overLOADING - Different signatures (Arguments) of functions within same class and same name

  // super methods - To access over ridden parent methods within a class

  final class Monkey(creatureTypeArg: String) extends Animal { //this method cannot be inherited as final keyword is used.
    override val creatureType = creatureTypeArg
    override def eat = {
      super.eat //this will access eat method from Animal class
      println("Wonk Wonk")
    }

  }

  val monkey = new Monkey("Fly")
  monkey.eat //this will print both eat from parent class Animal as well as eat method in Monkey


  //preventing overrides
  // 1. use final keyword on member
  // 2. use final on entire class
  // 3. seal the class - can be extended in current file, but will not allow to extend in another file

  sealed class Donkey() extends Animal {
    override def eat = {
      println("Eh Ah Eh Ah")
    }
  }

  val donkey = new Donkey()
  donkey.eat
}
