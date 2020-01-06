package exercises

object RecursiveExs extends App {
  def strConcatenate(ipstr: String, numTimes: Int): String = { //concatenate a string n times using tail recursion
    @scala.annotation.tailrec
    def concatHelper(concatStr: String, n: Int): String = {
      if (n == 1) concatStr
      else concatHelper(concatStr + " " + ipstr, n - 1)
    }

    concatHelper(ipstr, numTimes)
  }


  def tailrecFibonacci(n: Int): Int = {
    @scala.annotation.tailrec
    def auxTailRecFib(i: Int, last: Int, prev: Int): Int = {
      if (i >= n) last
      else auxTailRecFib(i + 1, last + prev, last)
    }

    auxTailRecFib(2, 1, 1)
  }

  println("Concatenated String: " + strConcatenate("Vignesh", 5))
  println("Fibonacci Result: " + tailrecFibonacci(10))
}
