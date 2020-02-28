package com.rockthejvm

object FunctionalProgramming {

  val simpleIncrementer = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1+1
  }

  simpleIncrementer(23)
  simpleIncrementer.apply(24)

  val stringConcat = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1+v2
  }

  stringConcat("I love ", "India")

  val doubler: Int => Int = (x: Int) => 2 * x
  doubler(4)

  val aMappedList: List[Int] = List(1, 2, 3).map(x => x+1)
  val aFlatMapped = List(1,2,3).flatMap {
    x => List(x, 2*x)
  }
  val aFilteredList = List(1, 2, 3, 4).filter(_ <= 3)

  val allPairs = List(1,2,3).flatMap(num => List('a', 'b', 'c').map(letter => s"$num-$letter"))

  val alternatePairs = for {
    num <- List(1,2,3)
    letter <- List('a', 'b', 'c')
  } yield s"$num-$letter"

  val aList = List(1,2,3)
  val firstElement = aList.head
  val rest = aList.tail
  val aPrependedLIst = 0 :: aList
  val extendList = 0 +: aList :+ 6

  val aSeq: Seq[Int] = Seq(1,2,3)
  val accessedElement = aSeq(2) // 3

  val aVect = Vector(1,2,3)

  val aSet = Set(1,2,3)
  val setHas2 = aSet.contains(2)
  val add = aSet + 8
  val del = aSet - 6

  val aRange = 1 to 1000
  val twoByTwo = aRange.map(x => 2 * x).toList

  val aTuple = ("Hello", "Varun", 1234)

  val phoneBook: Map[String, Int] = Map(("Daniel", 12345), ("Varun", 3214), "Ankita" -> 2342)

}
