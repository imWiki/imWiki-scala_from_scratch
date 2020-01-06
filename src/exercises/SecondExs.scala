package exercises

object SecondExs extends App {
  def greetingFunction(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old."
  }

  def factorialFunction(num: Int): Int = {
    if (num < 1) 1
    else num * factorialFunction(num - 1)
  }

  def fibFunction(num: Int): Int = {
    if (num <= 2) 1
    else fibFunction(num - 1) + fibFunction(num - 2)
  }

  def isPrime(num: Int): Boolean = {
    @scala.annotation.tailrec
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else num % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(num / 2)
  }

  println(greetingFunction("Vignesh", 28))
  println("Factorial " + factorialFunction(8))
  println("Fibonacci " + fibFunction(8))
  println("isPrime? " + isPrime(6))
}
