package com.stronghold

object Sandbox extends App {
  println("Random Data Generation Sandbox")

  val pets: Seq[Pet] = Pet.genPets(10)
  pets.foreach(println)
}
