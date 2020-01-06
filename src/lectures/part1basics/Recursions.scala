package lectures.part1basics

object Recursions extends App {
  def tailFactorial(n: BigInt): BigInt = {
    @scala.annotation.tailrec
    def auxFactHelper(n: BigInt, accumulator: BigInt): BigInt = {
      if (n <= 1) accumulator
      else auxFactHelper(n - 1, n * accumulator) //Efficient way of writing recursion call without overloading jvm
    }

    auxFactHelper(n, 1)
  }

  println(tailFactorial(10))
}
