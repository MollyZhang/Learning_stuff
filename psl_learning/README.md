### Learning PSL - Probabilistic Soft Logic
more information on PSL: http://psl.umiacs.umd.edu


#####1. Install example:

`mvn archetype:generate -DarchetypeArtifactId=psl-archetype-example \
-DarchetypeRepository=https://scm.umiacs.umd.edu/maven/lccd/content/repositories/psl-releases/ \
-DarchetypeGroupId=edu.umd.cs -DarchetypeVersion=1.2.1`

#####2. Compile:

`cd psl-example`

`mvn compile`

`mvn dependency:build-classpath -Dmdep.outputFile=classpath.out`

#####3. Run:

``java -cp ./target/classes:`cat classpath.out` edu.umd.cs.example.MollyPracticeExample``
