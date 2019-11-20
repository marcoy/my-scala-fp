package $package$

import cats.effect.Console.io._
import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  override def run(args: List[String]): IO[ExitCode] =
    putStrLn("Hello World") *> IO.pure(ExitCode.Success)
}
