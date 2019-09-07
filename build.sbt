name := "util-lib"

version := "0.1"

scalaVersion := "2.13.0"

organization := "org.bheaver.ngl4"

val mongodb = "org.mongodb.scala" %% "mongo-scala-driver" % "2.7.0"
val typesafe = "com.github.pureconfig" %% "pureconfig" % "0.11.1"
val logging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
val springcore = "org.springframework" % "spring-core" % "5.1.9.RELEASE"
val javaxServlet = "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
val json4s = "org.json4s" %% "json4s-jackson" % "3.6.7"
val scalatime = "com.github.nscala-time" %% "nscala-time" % "2.22.0"
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-web" % "2.1.7.RELEASE"


libraryDependencies += mongodb
libraryDependencies += typesafe
libraryDependencies += logging
libraryDependencies += springcore
libraryDependencies += javaxServlet
libraryDependencies += json4s
libraryDependencies += scalatime