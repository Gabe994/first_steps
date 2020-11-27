ThisBuild / scalaVersion := "2.12.10"

lazy val hello = (project in file("."))
  .settings(
    name := "postgresql_connection",
    libraryDependencies ++= Seq("org.postgresql" % "postgresql" % "9.4-1206-jdbc42")
  )