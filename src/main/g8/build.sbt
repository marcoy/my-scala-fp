import Dependencies._
import Settings._

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = project
  .settings(
    scalaVersion := Versions.scala
  )
  .aggregate(
    $name;format="Camel"$
  )

lazy val $name;format="Camel"$ = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "$name;format="Camel"$"
  , organization := "$organization$"
  , version := "$version$"
  , libraryDependencies ++= cats ++ droste ++ guava ++ newtype ++ monocle ++ pprint ++ refined ++ shapeless ++ slf4j
                         ++ simulacrum ++ zio ++ zioLogging ++ testlibs
  )
