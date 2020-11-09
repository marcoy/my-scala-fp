resolvers += Resolver.bintrayIvyRepo("rtimush", "sbt-plugin-snapshots")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.8.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.8.0-RC14")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.2-22-6de2d70")

addSbtPlugin("ch.epfl.scala" % "sbt-missinglink" % "0.3.1")

addSbtPlugin("com.github.cb372" % "sbt-explicit-dependencies" % "0.2.15")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.8.1")

addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.4.5")

addDependencyTreePlugin

// addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.10.0-RC1")

// addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")

// addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.28")
// libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.10.0"
