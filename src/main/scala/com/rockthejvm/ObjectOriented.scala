package com.rockthejvm

object ObjectOriented extends App {

  class Animal {
    val age: Int = 0
    def eat() = println("I'm eating")
  }

  val animal = new Animal

  class Dog(val name: String) extends Animal
  val aDog = new Dog("Lassie")

  aDog.name

  val aDeclaredAnimal: Animal = new Dog("Hachi")
  aDeclaredAnimal.eat()

  abstract class WalkingAnimal {
    val hasLegs = true
    def walk(): Unit
  }

  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait Philosopher {
    def ?!(thought: String): Unit
  }

  class Crocodile extends Animal with Carnivore with Philosopher {
    override def eat(animal: Animal): Unit = println("I'm goint to eat now")
    override def ?!(thought: String): Unit = println(s"I was thinking : $thought")
  }

  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog
  aCroc ?! "What if we could fly"

  val x = 1 + 2
  val y = 1.+(1)

  val aDino = new Carnivore {
    override def eat(animal: Animal): Unit = println("I'm a dino")
  }

  // singleton object
  object MySingleton {
    val mySpecialValue = 5345
    def mySpecialMethod(): Int = 234
    def apply(x: Int): Int = x  + 1
  }

  MySingleton(23)
  MySingleton.apply(34)
  MySingleton.mySpecialMethod()

  object Animal {
    val canLive = false
  }

  val anAnimal = Animal.canLive

  case class Person(name: String, age: Int)
  val bob = Person("bob", 43)

  try {
    val x: String = null
    x.length
  } catch {
    case e: Exception => "Some fault"
  } finally {
  }

  abstract class MyList[T] {
    def head: T
    def tail: MyList[T]
  }

  val aList: List[Int] = List(1, 2, 3)
  val first = aList.head
}
