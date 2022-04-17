resolvers += Resolver.bintrayIvyRepo("rtimush", "sbt-plugin-snapshots")
resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.9.0")

addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.9.9")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.2")

addSbtPlugin("ch.epfl.scala" % "sbt-missinglink" % "0.3.3")
libraryDependencies += "com.spotify" % "missinglink-core" % "0.2.5"

addSbtPlugin("com.github.cb372" % "sbt-explicit-dependencies" % "0.2.16")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.1.0")

addSbtPlugin("com.github.sbt" % "sbt-release" % "1.1.0")

addSbtPlugin("com.github.sbt" % "sbt-git" % "2.0.0")

// addSbtPlugin("org.scala-sbt"    % "sbt-autoversion" % "1.0.0")

addDependencyTreePlugin
