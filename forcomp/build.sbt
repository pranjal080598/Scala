

course := "progfun1"
assignment := "forcomp"
mainClass := Some("Anagrams")
scalaVersion := "2.13.2"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")


libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s")
