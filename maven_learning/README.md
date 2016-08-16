Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.

####to start a a project
`mvn archetype:generate`
#### compile:
`mvn compile`
#### package
`mvn package`
#### clean
`mvn clean`
#### generate class path
`mvn dependency:build-classpath -Dmdep.outputFile=classpath.out`
#### run a class
`java -cp ./target/classes:`cat classpath.out` <fully qualified class name>`
