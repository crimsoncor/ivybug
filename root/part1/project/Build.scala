import sbt._
import Keys._

object RootBuild 
  extends Build 
{
  import RootKeys._
  //
  // Project Declarations
  //
  
  lazy val part1 = Project(id = "part1", 
                           base = file("."),
                           settings =  mySettings)

  lazy val stuffArtifact = Artifact("part1", "stuff", "stuff",
                                    None,
                                    Configurations.Sources :: Nil, None)
                                     
  lazy val mySettings = Defaults.defaultSettings ++ addArtifact(stuffArtifact, stuffFileArtifact)
  
  object RootKeys
  {
    lazy val stuffFileArtifact = TaskKey[File](
      "stuff-file-artifact", "The file to package up as an artifact")
  }
}