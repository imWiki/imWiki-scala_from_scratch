package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 //expressions can be declared
  println(x)
  println(2 + 4 * 4 / 2) //mathematical expressions
  // operators
  // + add
  // - minus
  // * multiply
  // / divide
  // & bitwise and
  // | bitwise or
  // ^ bitwise exclusive or
  // << left shift
  // >> right shift
  // >>> (right shift with zero extension specific to scala)

  println(1 == x) //equality expression evaluates to boolean
  // ==, !=, >, >=, <, <=

  println(!(1 == x)) //negation expression
  // ! && ||

  var aVariable = 2
  aVariable += 3 // -=, *=, /=

  println(aVariable)

  // Instructions [Do] Vs Expressions [Value]

  // Instructions are set of statements we tell the computer to perform
  // Expressions are set of operations done on values with specific data types

  val aCond = true
  val aCondVal = if (aCond) "Yes" else "No" //If Expression
  println(aCondVal)
  //or like below,
  println(if (aCond) "Yes" else "No")

  /*Loops - Use of var and loops [While or for loops) will bring side effects or can be considered as imperative programming
  *        which is not advised in Scala unlike Java or any other OOPS based programming languages
  */

  var i = 0
  while (i < 5) {
    println(i)
    i += 1
  }
  //NEVER WRITE SUCH CODE IN SCALA
  //Everything in Scala are expressions

  val someValue = (aVariable = 4) // Unit === Void
  println(someValue)

  val aCodeBlock = {
    //Scope of val inside a code block val is limited within the val itself
    val firstVal = 1
    val secondVal = firstVal + 3
    if (secondVal > 3) "Yes" else "No"
    //such code blocks will take data type and value of last line within the definition, now type of aCodeBlock is String
  }

  println(aCodeBlock)

}
