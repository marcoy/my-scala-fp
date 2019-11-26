import Dependencies._
import Settings._

lazy val root = project
  .aggregate(
    $name;format="Camel"$
  )

lazy val $name;format="Camel"$ = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "$name;format="Camel"$"
  , organization := "$organization$"
  , version := "$version$"
  , libraryDependencies ++= cats ++ console4cats ++ logbackClassic ++ newtype ++ pprint ++ shapeless
                         ++ zio ++ testlibs
  )
