package com.rockthejvm

object PatternMatching extends App {

  val anInteger = 55
  val order = anInteger match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => anInteger + "th"
  }

  case class Person(name: String, age: Int)
  val bob = Person("bob", 123)

  // class decompose
  val personGreeting = bob match {
    case Person(n, a) => s"Name : $n, Age: $a"
    case _ => "Something else"
  }

  println(personGreeting)

  // tuple decompose
  val aTuple = ("Varun", "Vats")
  val greeting = aTuple match {
    case (name, surname) => s"Name : $name, Surname : $surname"
    case _ => "Something else"
  }

  println(greeting)

  // list decompose

  val aList = List(1, 2, 3)
  val check = aList match {
    case List(_, 2, _) => s"Found"
    case _ => "Something else"
  }

  println(check)
}
