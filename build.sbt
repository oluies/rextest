// Set the project name to the string 'My Project'
name := "rextest"

// The := method used in Name and Version is one of two fundamental methods.
// The other method is <<=
// All other initialization methods are implemented in terms of these.
version := "1.0"

scalacOptions += "-deprecation"

scalacOptions += "-unchecked" 

scalacOptions += "-Xcheckinit"

scalacOptions += "-Yrich-exceptions"

scalaVersion := "2.9.0-1"

// Add multiple dependencies
libraryDependencies ++= Seq(
    "junit" % "junit" % "4.8" % "test",
    "org.specs2" %% "specs2" % "1.3" % "test",
    "org.specs2" %% "specs2-scalaz-core" % "6.0.RC2" % "test",
    "com.digitaldoodles" %% "rex" % "0.7" 
)

//def specs2Framework = new TestFramework("org.specs2.runner.SpecsFramework")
//override def testFrameworks = super.testFrameworks ++ Seq(specs2Framework)

//val snapshots = "snapshots" at "http://scala-tools.org/repo-snapshots"
//val releases  = "releases" at "http://scala-tools.org/repo-releases"
        
// Exclude backup files by default.  This uses ~=, which accepts a function of
//  type T => T (here T = FileFilter) that is applied to the existing value.
// A similar idea is overriding a member and applying a function to the super value:
//  override lazy val defaultExcludes = f(super.defaultExcludes)
//
//defaultExcludes ~= (_ | "*~")
//defaultExcludes ~= (filter => filter | "*~")
//  Some equivalent ways of writing this:
//defaultExcludes ~= ( (_: FileFilter) | "*~")
//defaultExcludes ~= ( (filter: FileFilter) => filter | "*~")

