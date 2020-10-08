import sbt._

object ExtraDeps {
  object Versions {
    val sttp = "2.2.9"
  }

  val sttp: Seq[ModuleID] = Seq(
    "com.softwaremill.sttp.client" %% "core"                          % Versions.sttp
  , "com.softwaremill.sttp.client" %% "async-http-client-backend-zio" % Versions.sttp
  , "com.softwaremill.sttp.client" %% "slf4j-backend"                 % Versions.sttp
  )
}
