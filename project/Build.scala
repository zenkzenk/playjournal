import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "playjournal"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
        "commons-codec" % "commons-codec" % "1.5",
		"mysql" % "mysql-connector-java" % "5.1.20"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
