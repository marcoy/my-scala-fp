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

    val caffeine        = "2.8.8"
    val chimney         = "0.6.1"
    val decline         = "1.3.0"
    val doobie          = "0.9.4"
    val flyway          = "7.3.2"
    val jsch            = "0.1.55"
    val kantan          = "0.6.1"
    val postgresDriver  = "42.2.18.jre7"
    val quill           = "3.5.3"
    val scalacheckFaker = "5.0.10"
    val scalaTags       = "0.9.2"
    val selenium        = "3.141.59"
    val sqlite          = "3.34.0"
    val sshj            = "0.30.0"
    val sttp            = "3.0.0-RC11"
    val rocksDbJni      = "6.14.6"
    val scodecBits      = "1.1.23"
    val scodecCore      = "1.11.7"
    val slickPg         = "0.19.3"
    val zioAws          = "2.14.7.0"
  }

  val caffeine: Seq[ModuleID] = Seq(
    "com.github.ben-manes.caffeine" % "caffeine" % Versions.caffeine
  )

  val chimney: Seq[ModuleID] = Seq(
    "io.scalaland" %% "chimney"      % Versions.chimney,
    "io.scalaland" %% "chimney-cats" % Versions.chimney
  )

  val decline: Seq[ModuleID] = Seq(
    "com.monovore" %% "decline"            % Versions.decline,
    "com.monovore" %% "decline-refined"    % Versions.decline,
    "com.monovore" %% "decline-enumeratum" % Versions.decline
  )

  val jsch: Seq[ModuleID] = Seq(
    "com.jcraft" % "jsch" % Versions.jsch
  )

  val kantan: Seq[ModuleID] = Seq(
    "com.nrinaudo" %% "kantan.csv"            % Versions.kantan,
    "com.nrinaudo" %% "kantan.csv-java8"      % Versions.kantan,
    "com.nrinaudo" %% "kantan.csv-cats"       % Versions.kantan,
    "com.nrinaudo" %% "kantan.csv-generic"    % Versions.kantan,
    "com.nrinaudo" %% "kantan.csv-refined"    % Versions.kantan,
    "com.nrinaudo" %% "kantan.csv-enumeratum" % Versions.kantan,
    "com.nrinaudo" %% "kantan.csv-jackson"    % Versions.kantan
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

  val doobie: Seq[ModuleID] = Seq(
    "org.tpolecat" %% "doobie-core"      % Versions.doobie,
    "org.tpolecat" %% "doobie-hikari"    % Versions.doobie,
    "org.tpolecat" %% "doobie-postgres"  % Versions.doobie,
    "org.tpolecat" %% "doobie-quill"     % Versions.doobie,
    "org.tpolecat" %% "doobie-specs2"    % Versions.doobie % "test",
    "org.tpolecat" %% "doobie-scalatest" % Versions.doobie % "test"
  )

  val flyway: Seq[ModuleID] = Seq(
    "org.flywaydb" % "flyway-core" % Versions.flyway
  )

  val postgresDriver: Seq[ModuleID] = Seq(
    "org.postgresql" % "postgresql" % Versions.postgresDriver
  )

  val quill: Seq[ModuleID] = Seq(
    "io.getquill" %% "quill-async-postgres" % Versions.quill,
    "io.getquill" %% "quill-jdbc"           % Versions.quill,
    "io.getquill" %% "quill-codegen"        % Versions.quill,
    "io.getquill" %% "quill-codegen-jdbc"   % Versions.quill
  )

  val scodec: Seq[ModuleID] = Seq(
    "org.scodec" %% "scodec-bits" % Versions.scodecBits,
    "org.scodec" %% "scodec-core" % Versions.scodecCore
  )

  lazy val slickPg = Seq(
    "com.github.tminglei" %% "slick-pg"            % Versions.slickPg,
    "com.github.tminglei" %% "slick-pg_joda-time"  % Versions.slickPg,
    "com.github.tminglei" %% "slick-pg_circe-json" % Versions.slickPg
  )

  lazy val sqlite = Seq(
    "org.xerial" % "sqlite-jdbc" % Versions.sqlite
  )
}
