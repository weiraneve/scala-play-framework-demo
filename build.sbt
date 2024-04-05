import sbt.Keys._

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .enablePlugins(PlayService, PlayLayoutPlugin, Common)
  //.enablePlugins(PlayNettyServer).disablePlugins(PlayPekkoHttpServer) // uncomment to use the Netty backend
  .settings(
    name := "play-scala-rest-api-example",
    PlayKeys.playDefaultPort := 8080,
    libraryDependencies ++= Seq(
      guice,
      "org.joda" % "joda-convert" % "2.2.3",
      "net.logstash.logback" % "logstash-logback-encoder" % "7.3",
      "io.lemonlabs" %% "scala-uri" % "4.0.3",
      "net.codingwell" %% "scala-guice" % "6.0.0",
      "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
    )
  )
