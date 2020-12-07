package io.marcoy

import zio._
import zio.logging._
import zio.logging.slf4j.Slf4jLogger

object Main extends zio.App {
  object Layers {
    def apply() = {
      val logger = Slf4jLogger.makeWithAnnotationsAsMdc(List(LogAnnotation.CorrelationId))

      logger
    }
  }

  val program = for {
    _ <- log.info(s"Hello World")
  } yield ExitCode.success

  override def run(args: List[String]): ZIO[zio.ZEnv, Nothing, ExitCode] =
    program
      .provideCustomLayer(Layers())
}
