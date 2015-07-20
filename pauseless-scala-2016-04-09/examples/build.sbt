fork in run := true

libraryDependencies += "sh.den" % "scala-offheap_2.11" % "0.1"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

scalaVersion := "2.11.8"

javaOptions += "-Xmx64m"
