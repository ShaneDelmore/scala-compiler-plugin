# scala-compiler-plugin

Exercise material for Scala World 2016 talk "Return of the Scala Compiler Plugin"

## ENSIME Support

To get ensime support, create a file `ensime.sbt` with the following contents

```scala
EnsimeKeys.ensimeCompilerArgs += {
  val jar = (packageBin in Compile in LocalProject("plugins")).value
  s"-Xplugin:${jar.getCanonicalPath}"
}
```
