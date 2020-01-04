package lectures.part1basics

object ValuesVariableTypes extends App {
  //Val - Immutable Variables
  val anInt: Int = 102323223
  val firstString = "Hello, Scala"
  val firstBool = true
  val firstChar = 'c'
  val aShortInt: Short = 5121
  val aLongInt: Long = 876381622213123L
  val aFloat: Float = 2.09898f
  val aDouble: Double = 2.879878

  //Var - Mutable Variables

  var anIntVar: Int = 5
  anIntVar = 6 //Re-assignment won't through errors, not recommended to use in Scala due to "side effects"

}
