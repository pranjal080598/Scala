course := "progfun1"
assignment := "patmat"

scalaVersion := "2.13.2"
mainClass := Some("Huffman")

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s")
