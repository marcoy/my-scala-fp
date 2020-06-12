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
  , libraryDependencies ++= cats ++ droste ++ newtype ++ pprint ++ refined ++ shapeless ++ slf4j
                         ++ simulacrum ++ zio ++ testlibs
  )
