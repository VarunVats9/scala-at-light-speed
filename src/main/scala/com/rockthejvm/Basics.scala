package com.rockthejvm

object Basics extends App {

  val life: Int = 42
  val aBool: Boolean = true
  val aString = "Hello Amaya"
  val aComposedString = "My baby" + " " + "amaya"
  val anInterpolatedString = s"Hello Amaya $aComposedString"
  val aExpr = 2 + life
  val ifExpr = if (life > 89) 32 else 0
  val chainedExp =
    if (life < 100) 200
    else if (life > 200) 300
    else 500
  val aCodeBlock = {
    val st = 42
    st + 34
  }
  def aFunction(x: Int, y: String): String = y + " " + x
  def recursiveFunc(x: Int): Int = {
    if (x <= 1) 1
    else x * recursiveFunc(x-1)
  }
  def unitReturn(): Unit = {
    println("Hello Varun")
  }
  val theUnit = ()
}
