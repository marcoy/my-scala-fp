import sbt._

object ExtraDeps {
  object Versions {
    object commons {
      val codec   = "1.15"
      val crypto  = "1.1.0"
      val exec    = "1.3"
      val io      = "2.8.0"
      val logging = "1.2"
      val net     = "3.7.2"
      val vfs     = "2.6.0"
    }

    val jsch            = "0.1.55"
    val scalacheckFaker = "5.0.10"
    val scalaTags       = "0.9.2"
    val selenium        = "3.141.59"
    val sshj            = "0.30.0"
    val sttp            = "3.0.0-RC11"
    val zioAws          = "2.14.7.0"
    val rocksDbJni      = "6.13.3"
  }

  val jsch: Seq[ModuleID] = Seq(
    "com.jcraft" % "jsch" % Versions.jsch
  )

  val rocksdb: Seq[ModuleID] = Seq(
    "org.rocksdb" % "rocksdbjni" % Versions.rocksDbJni
  )

  val scalacheckFaker: Seq[ModuleID] = Seq(
    "io.github.etspaceman" %% "scalacheck-faker" % Versions.scalacheckFaker
  )

  val scalaTags: Seq[ModuleID] = Seq(
    "com.lihaoyi" %% "scalatags" % Versions.scalaTags
  )

  val selenium: Seq[ModuleID] = Seq(
    "org.seleniumhq.selenium" % "selenium-java"          % Versions.selenium,
    "org.seleniumhq.selenium" % "selenium-chrome-driver" % Versions.selenium
  )

  val sshj = Seq(
    "com.hierynomus" % "sshj" % Versions.sshj
  )

  val sttp: Seq[ModuleID] = Seq(
    "com.softwaremill.sttp.client3" %% "core"                          % Versions.sttp,
    "com.softwaremill.sttp.client3" %% "circe"                         % Versions.sttp,
    "com.softwaremill.sttp.client3" %% "async-http-client-backend-zio" % Versions.sttp,
    "com.softwaremill.sttp.client3" %% "httpclient-backend-zio"        % Versions.sttp,
    "com.softwaremill.sttp.client3" %% "slf4j-backend"                 % Versions.sttp
  )

  val zioAws: Seq[ModuleID] = Seq(
    "io.github.vigoo" %% "zio-aws-eks"       % Versions.zioAws,
    "io.github.vigoo" %% "zio-aws-http4s"    % Versions.zioAws,
    "io.github.vigoo" %% "zio-aws-netty"     % Versions.zioAws,
    "io.github.vigoo" %% "zio-aws-kinesis"   % Versions.zioAws,
    "io.github.vigoo" %% "zio-aws-s3"        % Versions.zioAws,
    "io.github.vigoo" %% "zio-aws-s3control" % Versions.zioAws,
    "io.github.vigoo" %% "zio-aws-sqs"       % Versions.zioAws
  )

  val commonsCodec: Seq[ModuleID] = Seq(
    "commons-codec" % "commons-codec" % Versions.commons.codec
  )

  val commonsCrypto: Seq[ModuleID] = Seq(
    "org.apache.commons" % "commons-crypto" % Versions.commons.crypto
  )

  val commonsExec: Seq[ModuleID] = Seq(
    "org.apache.commons" % "commons-exec" % Versions.commons.exec
  )

  val commonsIO: Seq[ModuleID] = Seq(
    "commons-io" % "commons-io" % Versions.commons.io
  )

  val commonsLogging: Seq[ModuleID] = Seq(
    "commons-logging" % "commons-logging" % Versions.commons.logging
  )

  val commonsNet: Seq[ModuleID] = Seq(
    "commons-net" % "commons-net" % Versions.commons.net
  )

  val commonsVfs2: Seq[ModuleID] = Seq(
    "org.apache.commons" % "commons-vfs2"          % Versions.commons.vfs,
    "org.apache.commons" % "commons-vfs2-examples" % Versions.commons.vfs
  )
}
