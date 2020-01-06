package exercises

object RecursiveExs extends App{
  def strConcatenate (ipstr: String, numTimes: Int): String = { //concatenate a string n times using tail recursion
    @scala.annotation.tailrec
    def concatHelper(concatStr: String, n: Int): String = {
      if (n==1) concatStr
      else concatHelper(concatStr + " " + ipstr,n-1)
    }
    concatHelper(ipstr,numTimes)
  }

  @scala.annotation.tailrec
  def tailrecFibonacci(i: Int, n: Int, last: Int, prev: Int): Int = {
    if (i>=n) last
    else tailrecFibonacci(i+1,n,last+prev,last)
  }

  println("Concatenated String: " + strConcatenate("Vignesh",5))
  println("Fibonacci Result: " + tailrecFibonacci(2,10,1,1))
}
