import sbt._
import Keys._
import ScalacOptions._

object Versions {
  val akka             = "2.6.10"
  val akkaAgent        = "2.5.31"
  val akkaContrib      = akkaAgent
  val akkaHttp         = "10.2.1"
  val betterMonadicFor = "0.3.1"
  val betterFiles      = "3.9.1"
  val cats             = "2.6.1"
  val catsCollections  = "0.9.3"
  val catsEffect       = "2.5.1"
  val catsMacros       = "2.1.1"
  val catsMtl          = "0.7.1"
  val catsTagless      = "0.14.0"
  val circe            = "0.14.1"
  val circeDroste      = "0.2.0"
  val contextual       = "1.2.1"
  val droste           = "0.8.0"
  val enumeratum       = "1.7.0"
  val fs2              = "3.0.6"
  val guava            = "30.1.1-jre"
  val http4s           = "0.21.28"
  val http4sJwtAuth    = "0.0.7"
  val kindProjector    = "0.13.2"
  val kittens          = "2.1.0"
  val logbackClassic   = "1.2.6"
  val meowMtl          = "0.4.1"
  val mockito          = "3.12.4"
  val monocle          = "2.1.0"
  val newtype          = "0.4.4"
  val pprint           = "0.6.6"
  val pureconfig       = "0.14.0"
  val refined          = "0.9.27"
  val rhoSwagger       = "0.21.0-RC2"
  val scalaCheck       = "1.15.4"
  val scalaTest        = "3.2.9"
  val servletApi       = "4.0.1"
  val simulacrum       = "1.0.1"
  val slf4j            = "1.7.32"
  val slick            = "3.3.3"
  val shapeless        = "2.3.7"
  val sttp             = "3.3.14"
  val upickle          = "1.2.2"
  val zio              = "1.0.11"
  val zioActors        = "0.0.9+3-737ae987-SNAPSHOT"
  val zioCats          = "2.5.1.0"
  val zioConfig        = "1.0.6"
  val zioQuery         = "0.2.10"
  val zioLogging       = "0.5.12"
  val zioProcess       = "0.3.0"

  val scala = "2.13.6"
}

object Dependencies {
  val akka: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-actor"          % Versions.akka,
    "com.typesafe.akka" %% "akka-agent"          % Versions.akkaAgent,
    "com.typesafe.akka" %% "akka-contrib"        % Versions.akkaContrib,
    "com.typesafe.akka" %% "akka-persistence"    % Versions.akka,
    "com.typesafe.akka" %% "akka-slf4j"          % Versions.akka,
    "com.typesafe.akka" %% "akka-stream"         % Versions.akka,
    "com.typesafe.akka" %% "akka-testkit"        % Versions.akka % "test",
    "com.typesafe.akka" %% "akka-stream-testkit" % Versions.akka % "test"
  )

  val akkaRemote: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-remote"             % Versions.akka,
    "com.typesafe.akka" %% "akka-multi-node-testkit" % Versions.akka % "test"
  )

  val akkaHttp: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-http"            % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-http-jackson"    % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-http-spray-json" % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-http-testkit"    % Versions.akkaHttp % "test"
  )

  val betterFiles: Seq[ModuleID] = Seq(
    "com.github.pathikrit" %% "better-files" % Versions.betterFiles
  )

  val cats: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-core"             % Versions.cats,
    "org.typelevel" %% "cats-kernel"           % Versions.cats,
    "org.typelevel" %% "cats-macros"           % Versions.catsMacros,
    "org.typelevel" %% "cats-free"             % Versions.cats,
    "org.typelevel" %% "cats-mtl-core"         % Versions.catsMtl,
    "org.typelevel" %% "cats-effect"           % Versions.catsEffect,
    "org.typelevel" %% "cats-tagless-macros"   % Versions.catsTagless,
    "org.typelevel" %% "cats-collections-core" % Versions.catsCollections,
    "org.typelevel" %% "cats-testkit"          % Versions.cats % "test"
  )

  val circe: Seq[ModuleID] = Seq(
    "io.circe" %% "circe-core"           % Versions.circe,
    "io.circe" %% "circe-literal"        % Versions.circe,
    "io.circe" %% "circe-generic"        % Versions.circe,
    "io.circe" %% "circe-generic-extras" % Versions.circe,
    "io.circe" %% "circe-optics"         % Versions.circe,
    "io.circe" %% "circe-parser"         % Versions.circe,
    "io.circe" %% "circe-refined"        % Versions.circe,
    "io.circe" %% "circe-testing"        % Versions.circe % "test"
  )

  val circeDroste: Seq[ModuleID] = Seq(
    "io.circe" %% "circe-droste" % Versions.circeDroste
  )

  val contextual: Seq[ModuleID] = Seq(
    "com.propensive" %% "contextual" % Versions.contextual
  )

  val droste: Seq[ModuleID] = Seq(
    "io.higherkindness" %% "droste-core" % Versions.droste
  )

  val enumeratum: Seq[ModuleID] = Seq(
    "com.beachape" %% "enumeratum"            % Versions.enumeratum,
    "com.beachape" %% "enumeratum-cats"       % Versions.enumeratum,
    "com.beachape" %% "enumeratum-circe"      % Versions.enumeratum,
    "com.beachape" %% "enumeratum-doobie"     % Versions.enumeratum,
    // "com.beachape" %% "enumeratum-macros"     % Versions.enumeratum,
    "com.beachape" %% "enumeratum-quill"      % Versions.enumeratum,
    "com.beachape" %% "enumeratum-scalacheck" % Versions.enumeratum % "test",
    "com.beachape" %% "enumeratum-test"       % Versions.enumeratum % "test"
  )

  val fs2: Seq[ModuleID] = Seq(
    "co.fs2" %% "fs2-core" % Versions.fs2,
    "co.fs2" %% "fs2-io"   % Versions.fs2
  )

  val guava: Seq[ModuleID] = Seq(
    "com.google.guava" % "guava" % Versions.guava
  )

  val http4s: Seq[ModuleID] = Seq(
    "org.http4s"     %% "http4s-blaze-server" % Versions.http4s,
    "org.http4s"     %% "http4s-blaze-client" % Versions.http4s,
    "org.http4s"     %% "http4s-circe"        % Versions.http4s,
    "org.http4s"     %% "http4s-dsl"          % Versions.http4s,
    "dev.profunktor" %% "http4s-jwt-auth"     % Versions.http4sJwtAuth
  )

  val kittens: Seq[ModuleID] = Seq(
    "org.typelevel" %% "kittens" % Versions.kittens
  )

  val logbackClassic: Seq[ModuleID] = Seq(
    "ch.qos.logback" % "logback-classic" % Versions.logbackClassic
  )

  val meowMtl: Seq[ModuleID] = Seq(
    "com.olegpy" %% "meow-mtl-core"    % Versions.meowMtl,
    "com.olegpy" %% "meow-mtl-effects" % Versions.meowMtl
  )

  val monocle: Seq[ModuleID] = Seq(
    "com.github.julien-truffaut" %% "monocle-core"    % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-generic" % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-macro"   % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-state"   % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-refined" % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-unsafe"  % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-law"     % Versions.monocle % "test"
  )

  val newtype: Seq[ModuleID] = Seq(
    "io.estatico" %% "newtype" % Versions.newtype
  )

  val pprint: Seq[ModuleID] = Seq(
    "com.lihaoyi" %% "pprint" % Versions.pprint
  )

  val pureconfig: Seq[ModuleID] = Seq(
    "com.github.pureconfig" %% "pureconfig" % Versions.pureconfig
  )

  val refined: Seq[ModuleID] = Seq(
    "eu.timepit" %% "refined"            % Versions.refined,
    "eu.timepit" %% "refined-cats"       % Versions.refined,
    "eu.timepit" %% "refined-eval"       % Versions.refined,
    "eu.timepit" %% "refined-jsonpath"   % Versions.refined,
    "eu.timepit" %% "refined-pureconfig" % Versions.refined,
    "eu.timepit" %% "refined-scalacheck" % Versions.refined,
    "eu.timepit" %% "refined-shapeless"  % Versions.refined
  )

  val rhoSwagger: Seq[ModuleID] = Seq(
    "org.http4s" %% "rho-swagger"    % Versions.rhoSwagger,
    "org.http4s" %% "rho-swagger-ui" % Versions.rhoSwagger
  )

  val slf4j: Seq[ModuleID] = Seq(
    "org.slf4j" % "slf4j-api" % Versions.slf4j
  ) ++ logbackClassic

  val servletAPI: Seq[ModuleID] = Seq(
    "javax.servlet" % "javax.servlet-api" % Versions.servletApi
  )

  val shapeless: Seq[ModuleID] = Seq(
    "com.chuusai" %% "shapeless" % Versions.shapeless
  )

  val sttp: Seq[ModuleID] = Seq(
    "com.softwaremill.sttp.client3" %% "core"                          % Versions.sttp,
    "com.softwaremill.sttp.client3" %% "circe"                         % Versions.sttp,
    "com.softwaremill.sttp.client3" %% "async-http-client-backend-zio" % Versions.sttp,
    "com.softwaremill.sttp.client3" %% "httpclient-backend-zio"        % Versions.sttp,
    "com.softwaremill.sttp.client3" %% "slf4j-backend"                 % Versions.sttp
  )

  val simulacrum: Seq[ModuleID] = Seq(
    "org.typelevel" %% "simulacrum" % Versions.simulacrum
  )

  val slick: Seq[ModuleID] = Seq(
    "com.typesafe.slick" %% "slick"          % Versions.slick,
    "com.typesafe.slick" %% "slick-codegen"  % Versions.slick,
    "com.typesafe.slick" %% "slick-hikaricp" % Versions.slick,
    "com.typesafe.slick" %% "slick-testkit"  % Versions.slick % "test"
  )

  val testlibs: Seq[ModuleID] = Seq(
    "org.scalatest"  %% "scalatest"    % Versions.scalaTest,
    "org.scalacheck" %% "scalacheck"   % Versions.scalaCheck,
    "org.mockito"     % "mockito-core" % Versions.mockito
  ) map (_ % "test")

  val upickle: Seq[ModuleID] = Seq(
    "com.lihaoyi" %% "upickle" % Versions.upickle,
    "com.lihaoyi" %% "ujson"   % Versions.upickle,
    "com.lihaoyi" %% "upack"   % Versions.upickle
  )

  val zio: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio"               % Versions.zio,
    "dev.zio" %% "zio-streams"       % Versions.zio,
    "dev.zio" %% "zio-interop-cats"  % Versions.zioCats,
    "dev.zio" %% "zio-macros"        % Versions.zio,
    "dev.zio" %% "zio-test"          % Versions.zio % "test",
    "dev.zio" %% "zio-test-sbt"      % Versions.zio % "test",
    "dev.zio" %% "zio-test-intellij" % Versions.zio % "test",
    "dev.zio" %% "zio-test-magnolia" % Versions.zio % "test"
  )

  val zioActors: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-actors"                  % Versions.zioActors,
    "dev.zio" %% "zio-actors-persistence"      % Versions.zioActors,
    "dev.zio" %% "zio-actors-persistence-jdbc" % Versions.zioActors
  )

  val zioConfig: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-config"          % Versions.zioConfig,
    "dev.zio" %% "zio-config-refined"  % Versions.zioConfig,
    "dev.zio" %% "zio-config-magnolia" % Versions.zioConfig,
    "dev.zio" %% "zio-config-typesafe" % Versions.zioConfig
  )

  val zioLogging: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-logging"       % Versions.zioLogging,
    "dev.zio" %% "zio-logging-slf4j" % Versions.zioLogging
  )

  val zioProcess: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-process" % Versions.zioProcess
  )

  val zioQuery: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-query" % Versions.zioQuery
  )
}

object Settings {
  object NexusSettings {
    private val unraidNexus = "http://192.168.1.166:8081"

    lazy val unraid = Seq(
      publishTo := {
        if (isSnapshot.value)
          Some(("snapshot" at unraidNexus + "/repository/maven-snapshots").withAllowInsecureProtocol(true))
        else
          Some(("releases" at unraidNexus + "/repository/maven-releases").withAllowInsecureProtocol(true))
      },
      resolvers ++= Seq(
        ("unraid-maven-releases" at unraidNexus + "/repository/maven-releases/").withAllowInsecureProtocol(true),
        ("unraid-maven-snapshots" at unraidNexus + "/repository/maven-snapshots/").withAllowInsecureProtocol(true)
      )
    )
  }

  lazy val rootSettings = Seq(
    scalaVersion := Versions.scala,
    publish / skip := true
  ) ++ NexusSettings.unraid

  lazy val commonSettings = Seq(
    scalaVersion := Versions.scala,
    scalacOptions ++= scalacFlags,
    Compile / console / scalacOptions ~= (_.filterNot(
      Set(
        "-Ywarn-unused:imports",
        "-Xfatal-warnings"
      )
    )),
    addCompilerPlugin("org.typelevel" %% "kind-projector"     % Versions.kindProjector cross CrossVersion.full),
    addCompilerPlugin("com.olegpy"    %% "better-monadic-for" % Versions.betterMonadicFor),
    run / fork := true,
    run / connectInput := true,
    updateOptions := updateOptions.value.withCachedResolution(true),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework"),
    resolvers ++= Seq(
      Resolver.typesafeRepo("releases"),
      Resolver.typesafeRepo("snapshots"),
      Resolver.sonatypeRepo("releases"),
      Resolver.sonatypeRepo("snapshots")
    )
  ) ++ NexusSettings.unraid
}
