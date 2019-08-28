package com.stronghold

import org.scalacheck.Gen
import org.scalacheck.Arbitrary

trait AgeField[A] extends DataField[Option[Int]] {
  val minAge: Int
  val maxAge: Int
}

object AgeField {
  implicit def genAge[A : AgeField]: Gen[Int] = {
    val min: Int = implicitly[AgeField[A]].minAge
    val max: Int = implicitly[AgeField[A]].maxAge
    Gen.choose(min, max)
  }

  implicit def arbAge[A : AgeField]: Arbitrary[Int] = Arbitrary(genAge)
}
