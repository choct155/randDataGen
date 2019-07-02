ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "com.stronghold"

lazy val randDataGen = ( project in file(".") )
  .settings(
    name := "Random Data Generator",
    libraryDependencies += "org.scalacheck" % "scalacheck_2.12" % "1.14.0",
    libraryDependencies += "org.typelevel" % "cats-core_2.12" % "2.0.0-M4",
    libraryDependencies += "org.apache.spark" % "spark-sql_2.12" % "2.4.0"
  )
