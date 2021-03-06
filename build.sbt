name := """textkeeper"""
organization := "me.naiden"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.2"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

libraryDependencies += "com.h2database" % "h2" % "1.4.192"
libraryDependencies += "com.typesafe.play" %% "play-slick" % "5.0.0"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "me.naiden.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "me.naiden.binders._"
