resolvers += "less is" at "http://repo.lessis.me"

//addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.1", "0.11.2)
libraryDependencies += Defaults.sbtPluginExtra("me.lessis" % "ls-sbt" % "0.1.1", "0.11.2", "2.9.1")

addSbtPlugin("net.virtual-void" % "sbt-cross-building" % "0.6.0")