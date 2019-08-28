package com.stronghold

import org.scalacheck.Gen
import org.scalacheck.Arbitrary

case class Name(value: Option[String]) extends NameField[Name] {
  val possibleNames: Set[String] = Set("Lumi", "Murphy", "Oscurita", "Persi")
}

object Name {

  implicit val n: Name = Name(None)

  implicit val genName: Gen[Name] = NameField.genName[Name].map{
    s: String => Name(Option(s))
  }

  implicit val arbName: Arbitrary[Name] = Arbitrary(genName)

}
