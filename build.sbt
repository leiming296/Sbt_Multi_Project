name := "Sbt_Multi_Project3"

version := "0.1"

scalaVersion := "2.12.4"


val commonSettings = Seq (
  organization in ThisBuild := "com.igg",
  version in ThisBuild := "0.1",
  scalaVersion in ThisBuild := "2.12.4",
//  libraryDependencies ++= Seq(
//    "org.scala-lang" % "scala-library" % scalaVersion.value,
//    "org.scala-lang" % "scala-compiler" % scalaVersion.value % "scala-tool"
//  )
)

lazy val aggregatedProjects: Seq[ProjectReference] = Seq(
  Hello_Class,
  Hello_List,
  Hello_Object

)
lazy val root = (project in file("."))
  .aggregate(Hello_Class, Hello_List,Hello_Object)



lazy val Hello_Class = ( project in file("Hello_Class") )
  .settings(
    name := "CaseClassTest",
    moduleName := "CaseClassTest",
    description := "Here are the cases calss examples.",
    commonSettings
  )

lazy val Hello_List = ( project in file("Hello_List") )
  .settings(
    name := "ListTest",
    moduleName := "ListTest",
    description := "Here are the List test examples.",
    commonSettings
  )

lazy val Hello_Object = ( project in file("Hello_Object") )
  .settings(
    name := "ObjectTest",
    moduleName := "ObjectTest",
    description := "Here are the object test examples.",
    commonSettings
  )
