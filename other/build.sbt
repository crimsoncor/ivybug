import RootBuild.{RootKeys => RK}

name := "other"

organization := "com.nowrench"

version := "0.0.1"

resolvers += Resolver.file("local-pub", file("/usr/tmp/repo"))(Resolver.ivyStylePatterns)

libraryDependencies += "com.nowrench" % "part1" % "0.0.1" % "compile->sources"

RK.artifactTest <<= (update, streams) map ( (update, streams) => {
  val log = streams.log
  val af: ArtifactFilter = (a: Artifact) => a.classifier.isEmpty
  update.matching(af).foreach( f => log.info(f.toString))
  "horse"
})