package com.stronghold

import org.scalacheck.Gen
import org.scalacheck.Arbitrary

case class Age(value: Option[Int]) extends AgeField[Age] {
  val minAge: Int = 2
  val maxAge: Int = 12
}

object Age {

  implicit val a: Age = Age(None)

  implicit val genAge: Gen[Age] = AgeField.genAge[Age].map{
    i: Int => Age(Option(i))
  }

  implicit val arbAge: Arbitrary[Age] = Arbitrary(genAge)

}
