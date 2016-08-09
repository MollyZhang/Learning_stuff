### Learning PSL - Probabilistic Soft Logic
more information on PSL: http://psl.umiacs.umd.edu


1. Install example:

`mvn archetype:generate -DarchetypeArtifactId=psl-archetype-example \
-DarchetypeRepository=https://scm.umiacs.umd.edu/maven/lccd/content/repositories/psl-releases/ \
-DarchetypeGroupId=edu.umd.cs -DarchetypeVersion=1.2.1`


2. Compile and run exmaple:

`cd psl-example`

`mvn complie`

`mvn dependency:build-classpath -Dmdep.outputFile=classpath.out`

``java -cp ./target/classes: `cat classpath.out` edu.umd.cs.example.MollyPracticeeExample`
