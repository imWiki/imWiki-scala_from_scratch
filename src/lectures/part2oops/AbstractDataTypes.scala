package lectures.part2oops

object AbstractDataTypes extends App{
  // abstract definitions

  abstract class Animal {
    val creatureType: String //abstract val
    def eat: Unit //abstract method
    def nonAbstract: Unit = println("This is not an abstract val, so abstract classes can contain mix of both abs & non-abs members")
  }

  //subclass will make the implementation & this can be instantiated only with extension or inheritance

  class Dog extends Animal {
    val creatureType: String = "Pet" //no need of override keyword as these are from abtract classes
    def eat: Unit = println("Bow Bow")
  }

  //traits
  trait Carnivore {
    def eats(animal: Animal): Unit
    val preferredMeal: String = "Fresh Meat" //traits can also have mix of abs & non-abs members
  }

  //1. traits cannot have constructors parameters
  //2. Multiple traits can be inherited by same class

  trait secondTest //empty trait

  class Crocodile extends Animal with Carnivore with secondTest{ //Inherits from both Animal and trait Carnivore
    //many traits can be inherited unlike class where only one can be extended/inherited
    val creatureType: String = "Amphibian"
    def eat: Unit = "Roarrrr"
    def eats(animal: Animal): Unit = println(s"I'm a crocodile eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eats(dog)
  croc.nonAbstract

}
