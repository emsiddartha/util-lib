name := "util-lib"

version := "0.1"

scalaVersion := "2.13.0"

organization := "org.bheaver.ngl4"

val mongodb = "org.mongodb.scala" %% "mongo-scala-driver" % "2.7.0"
val typesafe = "com.github.pureconfig" %% "pureconfig" % "0.11.1"
val logging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
val javaxServlet = "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
val json4s = "org.json4s" %% "json4s-jackson" % "3.6.7"
val scalatime = "com.github.nscala-time" %% "nscala-time" % "2.22.0"


libraryDependencies += mongodb
libraryDependencies += typesafe
libraryDependencies += logging
libraryDependencies += javaxServlet
libraryDependencies += json4s
libraryDependencies += scalatime