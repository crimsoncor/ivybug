import sbt._
import Keys._

object RootBuild 
  extends Build 
{
  import RootKeys._
  
  lazy val other = Project(id = "other",
                           base = file("."))
                           
  object RootKeys 
  {
    lazy val artifactTest = TaskKey[String]("artifact-test", "")
  }
}