package $organization$

import zio._
import zio.console._

object Main extends App {
  override def run(args: List[String]): ZIO[zio.ZEnv, Nothing, ExitCode] =
    putStrLn("Hello World").exitCode
}
