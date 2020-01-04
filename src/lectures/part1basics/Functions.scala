package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = a + " " + b //String Concatenation Function in single expression
  // or
  def aSecFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Vignesh", 100))

  //Function without an argument

  def someFunction() = 42 //Need not specify return type of function, compiler will infer in this case
  println("With Parenthesis " + someFunction())
  //or parenthesis after function call is not mandatory in scala
  println("Without Parenthesis " + someFunction)


  def aRepeatedFunction(aString: String, anInt: Int): String = { //Here return type cannot be figured out by compiler, so return type is mandatory
    //best practise is to write return type of any function always when possible
    if (anInt == 1) aString
    else aString + aRepeatedFunction(aString, anInt - 1) //One of the ways to avoid loops in functional paradigm - RECURSION
  }

  println(aRepeatedFunction("Vignesh ", 5))

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int) = a + b

    aSmallFunction(n, n - 1)
  }

  print(aBigFunction(5))
}
