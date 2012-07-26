import RootBuild.{RootKeys => RK}

name := "part1"

organization := "com.nowrench"

version := "0.0.1"

// disable using the Scala version in output paths and artifacts
crossPaths := false

publishArtifact in Compile := false

RK.stuffFileArtifact <<= (sourceDirectory in Compile) map (
  (dir) => {
    dir / "stuff/myFile.stuff"
})

publishMavenStyle := false

publishTo := Some(Resolver.file("local-pub", file("/usr/tmp/repo"))(Resolver.ivyStylePatterns))