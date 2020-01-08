package lectures.part1basics

object StringOperations extends App{
  val str: String = "Hello there, my name is Vignesh"
  val matchStr: String = "there"

  println(str.charAt(3)) //prints the char at given index
  println(str.substring(0,5)) //substring of start and end position are given as arguments
  println(str.split(" ").toList) //Split based on given character and convert to list
  println(str.startsWith("Hello")) //returns true on match
  println(str.replaceAll("Hello","Hey")) //replace all matching patterns
  println(str.toLowerCase) //no need of parenthesis when calling methods in scala, this will convert all characters to lower case
  println(str.length)
  println('p' +: str.substring(1,4) :+ 's')
  println(str.reverse)
  println(str.take(4))

  val strList = List("2","1")
  println('a' +: strList :+ 'b') //Prepend :+ or Append +: to a list of string or char, : comes facing the list always + denotes prepend or append


  //S-interpolator [String operations]
  val name = "vignesh"
  val age = 28
  val message = s"Hello my name is ${name.capitalize}, & my age is $age, next year i'll be ${age + 1} years old"
  println(message)

  //F-interpolator [Formatting]
  val amount = 2.67f
  val speed = 20
  println(f"${name.capitalize}%s will run at a speed of $speed%2.2f km/h") //formatting an integer to float value with 2 decimal precision using f

  //this can also be used for type validations for amount above
  //val amountValid = f"$amount%3d" Compiler error will be thrown for this line as amount is declared as float on top and validation is done for integer
  val amountValid = f"$amount%2.1f" //will strip decimal points to 1
  println(amountValid)

  //raw interpolator
  val newLineString = "Hello there \n........How are you?"
  println(raw"$newLineString")
  println(raw"Hello there \n How are you?") //escape characters will be skipped in raw interpolator
}
