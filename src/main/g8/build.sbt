import Dependencies._
import Settings._

// lazy val root = project.in(file("."))
//   .settings(commonSettings: _*)
//   .aggregate()

lazy val $name;format="Camel"$ = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "$name;format="Camel"$"
  , organization := "$org$"
  , version := "$version$"
  , libraryDependencies ++= cats ++ console4cats ++ logbackClassic ++ pprint ++ zio ++ testlibs
  )
