import AssemblyKeys._

name := "quandl-java"

assemblySettings

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.apache.httpcomponents" % "httpclient" % "4.2.5",
  "com.googlecode.json-simple" % "json-simple" % "1.1",
  "org.easymock" % "easymock" % "3.2",
  "junit" % "junit" % "4.11"
)

classDirectory in Compile <<= baseDirectory apply ( _ / "target" / "classes" )

