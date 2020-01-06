package lectures.part1basics

object NamedArguments extends App{

  def namedArg (name: String = "Vig", height: Float, weight: Float): Unit = {
    println(s"$name's height: $height & weight: $weight'")
  }

  //namedArg(169F,69F) Compiler will be confused with order of arguments as we've a default arg at the beginning,
  // 1. default arguments can be placed as last set of arguments in a method or
  // 2. we can pass arguments as named arguments like below, in that case order doesn't matter at all

  namedArg(weight = 69.0F, height = 169.0F)

}
