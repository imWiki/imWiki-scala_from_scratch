package lectures.part2oops

object Generics extends App{
  class MyList[A] {
    // here A is called a generic which can be substituted with any data type
    //use type A inside class definition

    def add[B >:A] (element: B): MyList[B] = ???
  }

  class MyMap[Key, Value]
  // Key & Value here are generics
  // Generics can also be written within traits

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods
  object MyList {
    def empty[A]: MyList[A] = new MyList[A] //Accessing generic defined in MyList "A" using companion object method signature
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem in generics

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // 2. INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. CONTRAVARIANCE
  class Trainer[-A]
  val trainerList: Trainer[Cat] = new Trainer[Animal]

  // Bounded Types

  // Upper bound <: , Lower Bound >:
  class Cage[A >: Dog] (animal: A)
  val cage = new Cage(new Animal)

  //class Car
  //val cage_err = new Cage(new Car) //This will throw runtime error

}
