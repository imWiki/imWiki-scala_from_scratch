package exercises

object FourthExs extends App{
  val codeWriter = new Writer("Vignesh","Meyyappan",1991)
  val comicWriter = new Writer("Vignesh","Meyyappan",1991)
  val codeBook = new Novel("Scala Programming",2019,codeWriter)
  val comicBook = new Novel("How I Met Your Father",2012,comicWriter)

  println(s"Author Full Name: ${codeWriter.fullName} & Book Edition Name: ${codeBook.fullBookName}")
  codeBook.authorAge

  //isWrittenby is overloaded method with different type of parameter.
  codeBook.isWrittenBy(codeWriter)
  codeBook.isWrittenBy("Vignesh Meyyappan")
  //both above lines will return true

  comicBook.isWrittenBy(codeWriter) //now this will return false thought names are same, object match will fail
  comicBook.isWrittenBy("Vignesh Meyyappan") // this will still return true as we're performing string match here.

  val newBookObj = codeBook.copy(2020)
  println(s"Author Full Name: ${newBookObj.author.fullName} & Book Edition Name: ${newBookObj.fullBookName}")

  val counterObj = new Counter
  counterObj.display //this will display 0 - default parameter set in class
  counterObj.increment.display //this wil display 1 - incremented value by 1
  counterObj.increment(5).display //this will display 5
  counterObj.increment.increment.increment.display //this will display 3, same method called thrice which will create three objects with inputs 1,2 and 3.
  counterObj.increment.increment.increment.decrement.display //this will display 2
}

class Writer(firstName: String, lastName: String, val yearOfBirth: Int ) {
  def fullName = firstName.capitalize + " " + lastName.capitalize
}

class Novel(bookName: String, yearOfRelease: Int, val author: Writer) { //author is instantiated structure from another class Writer
  val fullBookName = bookName + " - Edition " + yearOfRelease
  def authorAge = println(s"Age of ${author.fullName} at the time of release of `$fullBookName` is: ${yearOfRelease - author.yearOfBirth}")
  def isWrittenBy(author: Writer) = println(this.author == author) // returns true if whole object matches the instance created against writer class
  def isWrittenBy(fullName: String) = println(fullName == author.fullName) //returns true if author name matches the corresponding writer class full name
  def copy(latestReleaseYear: Int) = new Novel(bookName, latestReleaseYear, author)
  //above method creates new instance of Novel with new book name and release year with same author object
}

class Counter(startVal: Int = 0) {
  def increment = new Counter(startVal + 1) //classes can be instantiated inside def of same class
  def decrement = new Counter(startVal - 1)

  //both above def represent immutability of an object. To change value of a parameter, we're creating a new object here instead of overriding the existing one

  //overloading methods

  def increment(num: Int) = new Counter(startVal + num)
  def decrement(num: Int) = new Counter(startVal - num)

  //this can also be achieved by using recursion as below.

  /*
  def increment(num: Int): Counter = {
    if (num<=0) this //if n reaches 0, we're returning the same object
    else increment.increment(num-1) //else recursion occurs to increment the value until n times.
  }
   */

  def display = println(this.startVal)
}


