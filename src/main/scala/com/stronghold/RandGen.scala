package com.stronghold

import org.scalacheck.Gen
import org.scalacheck.Arbitrary.arbitrary
import org.apache.spark.sql._

object RandGen {

  def genSomeValue[A](gen: Gen[A]): A = gen.sample match {
    case Some(v) => v
    case None => genSomeValue[A](gen)
  }
  
}
