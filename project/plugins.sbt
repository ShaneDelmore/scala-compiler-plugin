addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")

scalacOptions in Compile ++= Seq("-feature", "-deprecation")

ivyLoggingLevel := UpdateLogging.Quiet

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M13")
