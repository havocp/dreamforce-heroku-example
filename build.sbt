import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

name := "dreamforce-heroku-example"

version := "1.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq("io.netty" % "netty" % "3.5.3.Final")
