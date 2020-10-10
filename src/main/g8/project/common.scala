import sbt._
import Keys._
import ScalacOptions._

object Versions {
  val betterMonadicFor = "0.3.1"
  val cats = "2.2.0"
  val catsColl = "0.9.0"
  val catsEffect = "2.1.4"
  val catsMtl = "0.7.1"
  val circe = "0.13.0"
  val droste = "0.8.0"
  val fs2 = "2.4.2"
  val guava = "29.0-jre"
  val kindProjector = "0.11.0"
  val logbackClassic = "1.2.3"
  val mockito = "3.3.3"
  val monocle = "2.0.5"
  val newtype = "0.4.4"
  val pprint = "0.6.0"
  val refined = "0.9.14"
  val scalatest= "3.1.2"
  val scalacheck = "1.14.3"
  val shapeless = "2.3.3"
  val silencer = "1.7.0"
  val simulacrum = "1.0.0"
  val slf4j = "1.7.30"
  val zio = "1.0.3"
  val zioCats = "2.2.0.1"
  val zioQuery = "0.2.5"
  val zioLogging = "0.5.3"
}

object Dependencies {
  val cats: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-core"             % Versions.cats
  , "org.typelevel" %% "cats-free"             % Versions.cats
  , "org.typelevel" %% "cats-mtl-core"         % Versions.catsMtl
  , "org.typelevel" %% "cats-effect"           % Versions.catsEffect
  , "org.typelevel" %% "cats-collections-core" % Versions.catsColl
  , "org.typelevel" %% "cats-testkit"          % Versions.cats        % "test"
  )

  val circe: Seq[ModuleID] = Seq(
    "io.circe" %% "circe-core"           % Versions.circe
  , "io.circe" %% "circe-literal"        % Versions.circe
  , "io.circe" %% "circe-generic"        % Versions.circe
  , "io.circe" %% "circe-generic-extras" % Versions.circe
  , "io.circe" %% "circe-optics"         % Versions.circe
  , "io.circe" %% "circe-parser"         % Versions.circe
  , "io.circe" %% "circe-refined"        % Versions.circe
  , "io.circe" %% "circe-testing"        % Versions.circe    % "test"
  )

  val droste: Seq[ModuleID] = Seq(
    "io.higherkindness" %% "droste-core" % Versions.droste
  )

  val fs2: Seq[ModuleID] = Seq(
    "co.fs2" %% "fs2-core" % Versions.fs2
  , "co.fs2" %% "fs2-io"   % Versions.fs2
  )

  val guava: Seq[ModuleID] = Seq(
    "com.google.guava" % "guava" % Versions.guava
  )

  val logbackClassic: Seq[ModuleID] = Seq(
    "ch.qos.logback" % "logback-classic" % Versions.logbackClassic
  )

  val monocle: Seq[ModuleID] = Seq(
    "com.github.julien-truffaut" %% "monocle-core"    % Versions.monocle
  , "com.github.julien-truffaut" %% "monocle-generic" % Versions.monocle
  , "com.github.julien-truffaut" %% "monocle-macro"   % Versions.monocle
  , "com.github.julien-truffaut" %% "monocle-state"   % Versions.monocle
  , "com.github.julien-truffaut" %% "monocle-refined" % Versions.monocle
  , "com.github.julien-truffaut" %% "monocle-unsafe"  % Versions.monocle
  , "com.github.julien-truffaut" %% "monocle-law"     % Versions.monocle % "test"
  )

  val newtype: Seq[ModuleID] = Seq(
    "io.estatico" %% "newtype" % Versions.newtype
  )

  val pprint: Seq[ModuleID] = Seq(
    "com.lihaoyi" %% "pprint" % Versions.pprint
  )

  val refined: Seq[ModuleID] = Seq(
    "eu.timepit" %% "refined"            % Versions.refined
  , "eu.timepit" %% "refined-cats"       % Versions.refined
  , "eu.timepit" %% "refined-eval"       % Versions.refined
  , "eu.timepit" %% "refined-jsonpath"   % Versions.refined
  , "eu.timepit" %% "refined-pureconfig" % Versions.refined
  , "eu.timepit" %% "refined-scalacheck" % Versions.refined
  , "eu.timepit" %% "refined-shapeless"  % Versions.refined
  )

  val slf4j: Seq[ModuleID] = Seq(
    "org.slf4j" % "slf4j-api" % Versions.slf4j
  ) ++ logbackClassic

  val shapeless: Seq[ModuleID] = Seq(
    "com.chuusai" %% "shapeless" % Versions.shapeless
  )

  val silencer: Seq[ModuleID] = Seq(
    compilerPlugin("com.github.ghik" % "silencer-plugin" % Versions.silencer cross CrossVersion.full)
  , "com.github.ghik" % "silencer-lib" % Versions.silencer % Provided cross CrossVersion.full
  )

  val simulacrum: Seq[ModuleID] = Seq(
    "org.typelevel" %% "simulacrum" % Versions.simulacrum
  )

  val sttp: Seq[ModuleID] = Seq(
    "com.softwaremill.sttp.client" %% "core"                          % Versions.sttp
  , "com.softwaremill.sttp.client" %% "async-http-client-backend-zio" % Versions.sttp
  , "com.softwaremill.sttp.client" %% "slf4j-backend"                 % Versions.sttp
  )

  val testlibs: Seq[ModuleID] = Seq(
    "org.scalatest"  %% "scalatest"                   % Versions.scalatest
  , "org.scalacheck" %% "scalacheck"                  % Versions.scalacheck
  , "org.mockito"     % "mockito-core"                % Versions.mockito
  ) map (_ % "test")

  val zio: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio"                         % Versions.zio
  , "dev.zio" %% "zio-streams"                 % Versions.zio
  , "dev.zio" %% "zio-interop-cats"            % Versions.zioCats
  , "dev.zio" %% "zio-query"                   % Versions.zioQuery
  , "dev.zio" %% "zio-test"                    % Versions.zio         % "test"
  , "dev.zio" %% "zio-test-sbt"                % Versions.zio         % "test"
  , "dev.zio" %% "zio-test-magnolia"           % Versions.zio         % "test"
  )

  val zioLogging: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-logging"       % Versions.zioLogging
  , "dev.zio" %% "zio-logging-slf4j" % Versions.zioLogging
  )

}

object Settings {
  lazy val commonSettings = Seq(
    scalaVersion := "2.13.3"
  , scalacOptions ++= scalacFlags
  , scalacOptions in (Compile, console) ~= (_.filterNot(Set(
      "-Ywarn-unused:imports",
      "-Xfatal-warnings"
    )))
  , addCompilerPlugin("org.typelevel"  %% "kind-projector"     % Versions.kindProjector cross CrossVersion.full)
  , addCompilerPlugin("com.olegpy"     %% "better-monadic-for" % Versions.betterMonadicFor)
  , fork in run := true
  , run / connectInput := true
  , updateOptions := updateOptions.value.withCachedResolution(true)
  , testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  , resolvers ++= Seq(
      Resolver.typesafeRepo("releases")
    , Resolver.typesafeRepo("snapshots")
    , Resolver.sonatypeRepo("releases")
    , Resolver.sonatypeRepo("snapshots")
    )
  )
}
