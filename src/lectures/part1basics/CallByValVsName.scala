package lectures.part1basics

object CallByValVsName extends App {

  def callByValue(tm: Long): Unit = {
    println("Value: " + tm)
    println("Value: " + tm) //both print statements will print same time as tm will be evaluated in function call itself
  }

  def callByName(tm: => Long): Unit = { // => mentioned here will re-trigger the argument passed every time this variable is used inside the definition
    println("Name: " + tm)
    println("Name: " + tm) //hence time printed second time will change in the console
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

}
