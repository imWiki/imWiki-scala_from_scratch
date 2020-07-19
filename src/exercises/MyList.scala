package exercises

/**
 * Sixth Exercise
 * Implement a custom list function using an abstract class and inheritance
 */

abstract class MyList {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(num: Int): MyList
  def printElements: String
  // polymorphic call
  override def toString: String = "[" + printElements + "]"

}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(num: Int): MyList = new Cons(num, Empty)
  override def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(num: Int): MyList = new Cons(num, this)
  override def printElements: String = {
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
  }
}

object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list.head)
  println(list.tail.head)
  println(list.isEmpty)
  val newList = list.add(4)
  println(newList.head)
  println(newList.toString)

  val list_2 = Empty
  println(list_2.isEmpty)
  println(list_2.toString)

  println(list_2 add 5 add 4 add 7 add 8 toString)
}
