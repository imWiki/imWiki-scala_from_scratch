package exercises

/**
 * Sixth Exercise
 * Implement a custom list function using an abstract class and inheritance
 */

abstract class MyListGeneric[+A] {

  def head: A
  def tail: MyListGeneric[A]
  def isEmpty: Boolean
  def add[B >: A](num: B): MyListGeneric[B]
  def printElements: String
  // polymorphic call
  override def toString: String = "[" + printElements + "]"

}

object Empty_G extends MyListGeneric[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyListGeneric[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](num: B): MyListGeneric[B] = new Cons_G(num, this)
  override def printElements: String = ""
}

class Cons_G[+A](h: A, t: MyListGeneric[A]) extends MyListGeneric[A] {
  def head: A = h

  def tail: MyListGeneric[A] = t

  def isEmpty: Boolean = false

  def add[B >: A](num: B): MyListGeneric[B] = new Cons_G(num, this)

  override def printElements: String = {
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
  }
}

object MyListGenericTest extends App {
  val listOfIntegers: MyListGeneric[Int] = new Cons_G(1, new Cons_G(2, Empty_G))

  println(listOfIntegers.toString)

  val listOfStrings: MyListGeneric[String] = new Cons_G("Kavin", new Cons_G("Vignesh", Empty_G))

  println(listOfStrings.toString)
}
