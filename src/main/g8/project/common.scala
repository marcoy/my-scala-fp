import sbt._
import Keys._
import ScalacOptions._

object Dependencies {
  val akkaVersion           = "2.6.0"
  val akkaHttpVersion       = "10.1.10"
  val catsVersion           = "2.0.0"
  val catsCollsVersion      = "0.9.0"
  val catsMTLVersion        = "0.7.0"
  val catsEffectVersion     = "2.0.0"
  val catsTaglessVersion    = "0.10"
  val circeVersion          = "0.12.3"
  val configVersion         = "1.3.3"
  val console4catsVersion   = "0.8.0"
  val contextualVersion     = "1.2.1"
  val fetchVersion          = "1.2.1"
  val fs2Version            = "2.1.0"
  val guavaVersion          = "28.1-jre"
  val http4sVersion         = "0.21.0-M5"
  val http4sJwtAuthVersion  = "0.0.3"
  val kantanVersion         = "0.1.18"
  val kindProjectorVersion  = "0.11.0"
  val kittensVersion         = "2.0.0"
  val logbackClassicVersion = "1.2.3"
  val macwireVersion        = "2.3.3"
  val matryoshkaVersion     = "0.21.3"
  val meowMtlVersion        = "0.4.0"
  val mockitoVersion        = "3.1.0"
  val monixVersion          = "3.1.0"
  val monocleVersion        = "2.0.0"
  val mouseVersion          = "0.23"
  val newtypeVersion        = "0.4.3"
  val pprintVersion         = "0.5.6"
  val refinedVersion        = "0.9.10"
  val scalaCheckVersion     = "1.14.2"
  val scalaMockVersion      = "3.5.0"
  val scalaTestVersion      = "3.0.8"
  val servletApiVersion     = "3.1.0"
  val shapelessVersion      = "2.3.3"
  val silencerVersion       = "1.4.2"
  val simulacrumVersion     = "1.0.0"
  val skunkVersion          = "0.0.6"
  val slf4jVersion          = "1.7.29"
  val slickVersion          = "3.3.1"
  val zioVersion            = "1.0.0-RC17"
  val zioCatsVersion        = "2.0.0.0-RC9"
  val zioMonixVersion       = "3.1.0.0-RC1"
  val zioFutureVersion      = "2.12.8.0-RC6"
  val zioReactiveVersion    = "1.0.3.5-RC2"


  val akka: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-actor"          % akkaVersion
  , "com.typesafe.akka" %% "akka-agent"          % "2.5.26"
  , "com.typesafe.akka" %% "akka-contrib"        % "2.5.26"
  , "com.typesafe.akka" %% "akka-persistence"    % akkaVersion
  , "com.typesafe.akka" %% "akka-slf4j"          % akkaVersion
  , "com.typesafe.akka" %% "akka-stream"         % akkaVersion
  , "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % "test"
  , "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % "test"
  )

  val akkaRemote: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-remote"             % akkaVersion
  , "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion % "test"
  )

  val akkaHttp: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion
  , "com.typesafe.akka" %% "akka-http-jackson"    % akkaHttpVersion
  , "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion
  , "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % "test"
  )

  val cats: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-core"             % catsVersion
  , "org.typelevel" %% "cats-kernel"           % catsVersion
  , "org.typelevel" %% "cats-macros"           % catsVersion
  , "org.typelevel" %% "cats-free"             % catsVersion
  , "org.typelevel" %% "cats-mtl-core"         % catsMTLVersion
  , "org.typelevel" %% "cats-effect"           % catsEffectVersion
  , "org.typelevel" %% "cats-tagless-macros"   % catsTaglessVersion
  , "org.typelevel" %% "mouse"                 % mouseVersion
  , "org.typelevel" %% "cats-collections-core" % catsCollsVersion
  , "org.typelevel" %% "cats-testkit"          % catsVersion        % "test"
  )

  val circe: Seq[ModuleID] = Seq(
    "io.circe" %% "circe-core"           % circeVersion
  , "io.circe" %% "circe-literal"        % circeVersion
  , "io.circe" %% "circe-generic"        % circeVersion
  // , "io.circe" %% "circe-generic-extras" % circeVersion
  // , "io.circe" %% "circe-optics"         % circeVersion
  , "io.circe" %% "circe-parser"         % circeVersion
  // , "io.circe" %% "circe-java8"          % circeVersion
  , "io.circe" %% "circe-testing"        % circeVersion % "test"
  )

  val console4cats: Seq[ModuleID] = Seq(
    "dev.profunktor" %% "console4cats" % console4catsVersion
  )

  val contextual: Seq[ModuleID] = Seq(
    "com.propensive" %% "contextual" % contextualVersion
  )

  val fetch: Seq[ModuleID] = Seq(
    "com.47deg" %% "fetch"       % fetchVersion
  , "com.47deg" %% "fetch-debug" % fetchVersion
  )

  val fs2: Seq[ModuleID] = Seq(
    "co.fs2" %% "fs2-core" % fs2Version
  , "co.fs2" %% "fs2-io"   % fs2Version
  )

  val guava: Seq[ModuleID] = Seq(
    "com.google.guava" % "guava" % guavaVersion
  )

  val http4s: Seq[ModuleID] = Seq(
    "org.http4s"     %% "http4s-blaze-server" % http4sVersion
  , "org.http4s"     %% "http4s-blaze-client" % http4sVersion
  , "org.http4s"     %% "http4s-circe"        % http4sVersion
  , "org.http4s"     %% "http4s-dsl"          % http4sVersion
  , "dev.profunktor" %% "http4s-jwt-auth"     % http4sJwtAuthVersion
  )

  val kantan: Seq[ModuleID] = Seq(
    "com.nrinaudo" %% "kantan.csv"               % kantanVersion
  , "com.nrinaudo" %% "kantan.csv-generic"       % kantanVersion
  )

  val kittens: Seq[ModuleID] = Seq(
    "org.typelevel" %% "kittens" % kittensVersion
  )

  val logbackClassic: Seq[ModuleID] = Seq(
    "ch.qos.logback" % "logback-classic" % logbackClassicVersion
  )

  val macwire: Seq[ModuleID] = Seq(
    "com.softwaremill.macwire" %% "macros"     % macwireVersion % "provided"
  , "com.softwaremill.macwire" %% "macrosakka" % macwireVersion % "provided"
  , "com.softwaremill.macwire" %% "util"       % macwireVersion
    // Interceptors and scopes; has dependency on `javassist`
//  , "com.softwaremill.macwire" %% "proxy"      % macwireVersion
  )

  val matryoshka: Seq[ModuleID] = Seq(
    "com.slamdata" %% "matryoshka-core" % matryoshkaVersion
  )

  val meowMtl: Seq[ModuleID] = Seq(
    "com.olegpy" %% "meow-mtl-core"    % meowMtlVersion
  , "com.olegpy" %% "meow-mtl-effects" % meowMtlVersion
  , "com.olegpy" %% "meow-mtl-monix"   % meowMtlVersion
  )

  val monix: Seq[ModuleID] = Seq(
    "io.monix" %% "monix"      % monixVersion
//  , "io.monix" %% "monix-cats" % monixVersion
  )

  val monocle: Seq[ModuleID] = Seq(
    "com.github.julien-truffaut" %% "monocle-core"    % monocleVersion
  , "com.github.julien-truffaut" %% "monocle-generic" % monocleVersion
  , "com.github.julien-truffaut" %% "monocle-macro"   % monocleVersion
  , "com.github.julien-truffaut" %% "monocle-state"   % monocleVersion
  , "com.github.julien-truffaut" %% "monocle-refined" % monocleVersion
  , "com.github.julien-truffaut" %% "monocle-unsafe"  % monocleVersion
  , "com.github.julien-truffaut" %% "monocle-law"     % monocleVersion % "test"
  )

  val newtype: Seq[ModuleID] = Seq(
    "io.estatico" %% "newtype" % newtypeVersion
  )

  val pprint: Seq[ModuleID] = Seq(
    "com.lihaoyi" %% "pprint" % pprintVersion
  )

  val refined: Seq[ModuleID] = Seq(
    "eu.timepit" %% "refined"            % refinedVersion
  , "eu.timepit" %% "refined-cats"       % refinedVersion
  , "eu.timepit" %% "refined-eval"       % refinedVersion
  , "eu.timepit" %% "refined-jsonpath"   % refinedVersion
  , "eu.timepit" %% "refined-pureconfig" % refinedVersion
  , "eu.timepit" %% "refined-scalacheck" % refinedVersion
  , "eu.timepit" %% "refined-shapeless"  % refinedVersion
  )

  val slf4j: Seq[ModuleID] = Seq(
    "org.slf4j" % "slf4j-api" % slf4jVersion
  ) ++ logbackClassic

  val servletAPI: Seq[ModuleID] = Seq(
    "javax.servlet" % "javax.servlet-api" % servletApiVersion
  )

  val shapeless: Seq[ModuleID] = Seq(
    "com.chuusai" %% "shapeless" % shapelessVersion
  )

  val silencer: Seq[ModuleID] = Seq(
    compilerPlugin("com.github.ghik" %% "silencer-plugin" % silencerVersion)
  , "com.github.ghik" %% "silencer-lib" % silencerVersion % Provided
  )

  val simulacrum: Seq[ModuleID] = Seq(
    "org.typelevel" %% "simulacrum" % simulacrumVersion
  )

  val skunk: Seq[ModuleID] = Seq(
    "org.tpolecat" %% "skunk-core" % skunkVersion
  )

  val slick: Seq[ModuleID] = Seq(
    "com.typesafe.slick" %% "slick"          % slickVersion
  , "com.typesafe.slick" %% "slick-hikaricp" % slickVersion
  , "com.typesafe.slick" %% "slick-testkit"  % slickVersion % "test"
  )

  val typesafeConfig: Seq[ModuleID] = Seq(
    "com.typesafe" % "config" % configVersion
  )

  val testlibs: Seq[ModuleID] = Seq(
    "org.scalatest"  %% "scalatest"                   % scalaTestVersion
  , "org.scalacheck" %% "scalacheck"                  % scalaCheckVersion
  , "org.mockito"     % "mockito-core"                % mockitoVersion
  ) map (_ % "test")

  val zio: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio"                         % zioVersion
  , "dev.zio" %% "zio-streams"                 % zioVersion
  , "dev.zio" %% "zio-interop-cats"            % zioCatsVersion
  , "dev.zio" %% "zio-interop-monix"           % zioMonixVersion
  , "dev.zio" %% "zio-interop-future"          % zioFutureVersion
  , "dev.zio" %% "zio-interop-reactivestreams" % zioReactiveVersion
  , "dev.zio" %% "zio-test"                    % zioVersion         % "test"
  , "dev.zio" %% "zio-test-sbt"                % zioVersion         % "test"
  )
}

object Settings {
  lazy val commonSettings = Seq(
    scalaVersion := "2.13.1"
  , scalacOptions ++= scalacFlags
  , scalacOptions in (Compile, console) ~= (_.filterNot(Set(
      "-Ywarn-unused:imports",
      "-Xfatal-warnings"
    )))
  , addCompilerPlugin("org.typelevel"  %% "kind-projector"     % Dependencies.kindProjectorVersion cross CrossVersion.full)
  , addCompilerPlugin("com.olegpy"     %% "better-monadic-for" % "0.3.1")
  , fork in run := true
  , updateOptions := updateOptions.value.withCachedResolution(true)
  , resolvers ++= Seq(
      Resolver.typesafeRepo("releases")
    , Resolver.typesafeRepo("snapshots")
    , Resolver.sonatypeRepo("releases")
    , Resolver.sonatypeRepo("snapshots")
    )
  )
}
