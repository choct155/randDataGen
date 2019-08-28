package com.stronghold

import org.scalacheck.Gen
import org.scalacheck.Arbitrary

case class Pet(name: Name, age: Age) 

object Pet {

  def randPet: Pet = {
    val name: Name = RandGen.genSomeValue(Name.genName)
    val age: Age = RandGen.genSomeValue(Age.genAge)
    Pet(name, age)
  }

  def genPets(numPets: Int): Seq[Pet] = (1 to numPets).map(i => randPet)
}
