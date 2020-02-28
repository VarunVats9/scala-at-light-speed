package com.rockthejvm

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}
import scala.concurrent.ExecutionContext.Implicits.global

object Advanced extends App {

  lazy val aLazyVal: Int = 43
  lazy val aLaz = {
    println("Hello")
    aLazyVal
  }

  val aLaz2 = {
    println("Hello")
    aLazyVal
  }

  def methodReturnsNull(): String = "Hello, Scala"
  val anOption = Option(methodReturnsNull())
  val stringProcessing = anOption match {
    case Some(string) => s"I have obtained a valid $string"
    case None => "I obtained nothing"
  }

  def methodThrowException(): String = throw new Exception
  val aTry = Try(methodThrowException())
  val anotherStringProcessing = aTry match {
    case Success(value) => s"Obtained successful value : $value"
    case Failure(exception) => s"Exception : $exception"
  }

  val aFuture = Future {
    println("Loading")
    Thread.sleep(1000)
    println("Done")
    67
  }

  Thread.sleep(5000)

  def aMethodWithImplicit(implicit arg: Int) = arg+1
  implicit val myImplicit = 46
  println(aMethodWithImplicit)

  implicit class RichInteger(n: Int) {
    def isEven(): Boolean = n % 2 == 0
  }

  println(23.isEven())
}
