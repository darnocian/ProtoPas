# what is this

A sample project illustrating the use of antlr predicates. 

Project is built in java using Intellij and uses gradle.

This is pretty minimalistic in order to illustrate the particular feature.

see Grammar/ProtoPas.g4 - antlr source
    gen.bat - to generate the source files
    src/main/java/Delphi.java - supportsInlineVar is used to control inline var support
    src/main/java/ProtoWalker.java - creates very simplistic and probably buggy ast output
    src/main/java/ThrowingErrorListner.java - raise exceptions on parser error
    src/main/java/Main.java - simple main
    src/test/java/coProtoPasTests.java - some basic units tests