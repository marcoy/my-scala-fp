resolvers += Resolver.bintrayIvyRepo("rtimush", "sbt-plugin-snapshots")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.5.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.3")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.2-2-c62c37e")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.10.0-RC1")

// addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.28")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.10.0"

addDependencyTreePlugin
