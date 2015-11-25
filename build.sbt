name := "naive-bayes"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % "1.5.2",
	"ch.qos.logback" % "logback-classic" % "1.1.1" % "test",
	"org.scalatest" %% "scalatest" % "2.1.0" % "test",
	"org.mockito" % "mockito-all" % "1.9.5" % "test"
)

//releaseSettings

//scalariformSettings
