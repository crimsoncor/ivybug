import sbt._
import Keys._

object RootBuild 
  extends Build 
{

  lazy val part2 = Project(id = "part2",
                            base = file(".")) dependsOn(part1 % "compile->sources")
  lazy val part1 =
    ProjectRef(uri("../part1"), "part1")

}