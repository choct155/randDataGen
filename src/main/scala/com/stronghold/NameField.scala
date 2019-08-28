package com.stronghold

import org.scalacheck.Gen
import org.scalacheck.Arbitrary

trait NameField[A] extends DataField[Option[String]] {
  val possibleNames: Set[String]
}

object NameField {
  implicit def genName[A : NameField]: Gen[String] = {
    Gen.oneOf(implicitly[NameField[A]].possibleNames.toSeq)
  }

  implicit def arbName[A : NameField]: Arbitrary[String] = Arbitrary(genName)
}
