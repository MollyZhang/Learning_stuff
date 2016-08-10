//    impliment basic commandline psl example

package edu.umd.cs.example;

import java.text.DecimalFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;

import edu.umd.cs.psl.application.inference.MPEInference;
import edu.umd.cs.psl.application.learning.weight.maxlikelihood.MaxLikelihoodMPE;
import edu.umd.cs.psl.config.*
import edu.umd.cs.psl.database.DataStore
import edu.umd.cs.psl.database.Database;
import edu.umd.cs.psl.database.DatabasePopulator;
import edu.umd.cs.psl.database.Partition;
import edu.umd.cs.psl.database.ReadOnlyDatabase;
import edu.umd.cs.psl.database.rdbms.RDBMSDataStore
import edu.umd.cs.psl.database.rdbms.driver.H2DatabaseDriver
import edu.umd.cs.psl.database.rdbms.driver.H2DatabaseDriver.Type
import edu.umd.cs.psl.groovy.PSLModel;
import edu.umd.cs.psl.groovy.PredicateConstraint;
import edu.umd.cs.psl.groovy.SetComparison;
import edu.umd.cs.psl.model.argument.ArgumentType;
import edu.umd.cs.psl.model.argument.GroundTerm;
import edu.umd.cs.psl.model.argument.UniqueID;
import edu.umd.cs.psl.model.argument.Variable;
import edu.umd.cs.psl.model.atom.GroundAtom;
import edu.umd.cs.psl.model.function.ExternalFunction;
import edu.umd.cs.psl.ui.functions.textsimilarity.*
import edu.umd.cs.psl.ui.loading.InserterUtils;
import edu.umd.cs.psl.util.database.Queries;

////////////////////////// initial setup ////////////////////////
ConfigManager cm = ConfigManager.getManager()
ConfigBundle config = cm.getBundle("basic-example")

def defaultPath = System.getProperty("java.io.tmpdir")
String dbpath = config.getString("dbpath", defaultPath + File.separator + "basic-example")
DataStore data = new RDBMSDataStore(new H2DatabaseDriver(Type.Disk, dbpath, true), config)
PSLModel m = new PSLModel(this, data)

////////////////////////// predicate declaration ////////////////////////
m.add predicate: "Person",       types: [ArgumentType.UniqueID]
m.add predicate: "Location",     types: [ArgumentType.UniqueID]
m.add predicate: "Knows",        types: [ArgumentType.UniqueID, ArgumentType.UniqueID]
m.add predicate: "Lives",        types: [ArgumentType.UniqueID, ArgumentType.UniqueID]

///////////////////////////// rules ////////////////////////////////////
m.add rule : ( Knows(P1, P2) & Lives(P1, L) ) >> Lives(P2, L),  weight : 10
m.add rule : ( Knows(P2, P1) & Lives(P1, L) ) >> Lives(P2, L),  weight : 10
m.add rule: ~Lives(P, L), weight: 2

println m;

/*
//////////////////////////// data setup ///////////////////////////
// loads data
def dir = 'data'+java.io.File.separator+'sn'+java.io.File.separator;
def evidencePartition = new Partition(0);

insert = data.getInserter(Name, evidencePartition);
InserterUtils.loadDelimitedData(insert, dir+"sn_names.txt");

insert = data.getInserter(Network, evidencePartition)
InserterUtils.loadDelimitedData(insert, dir+"sn_network.txt");

insert = data.getInserter(Knows, evidencePartition)
InserterUtils.loadDelimitedData(insert, dir+"sn_knows.txt");

// loads target
def targetPartition = new Partition(1);
Database db = data.getDatabase(targetPartition, [Network, Name, Knows] as Set, evidencePartition);

Set<GroundTerm> usersA = new HashSet<GroundTerm>();
Set<GroundTerm> usersB = new HashSet<GroundTerm>();
for (int i = 1; i < 8; i++)
	usersA.add(data.getUniqueID(i));
for (int i = 11; i < 18; i++)
	usersB.add(data.getUniqueID(i));

Map<Variable, Set<GroundTerm>> popMap = new HashMap<Variable, Set<GroundTerm>>();
popMap.put(new Variable("UserA"), usersA)
popMap.put(new Variable("UserB"), usersB)

DatabasePopulator dbPop = new DatabasePopulator(db);
dbPop.populate((SamePerson(UserA, UserB)).getFormula(), popMap);
dbPop.populate((SamePerson(UserB, UserA)).getFormula(), popMap);


//////////////////////////// run inference ///////////////////////////
MPEInference inferenceApp = new MPEInference(m, db, config);
inferenceApp.mpeInference();
inferenceApp.close();

println "Inference results with hand-defined weights:"
DecimalFormat formatter = new DecimalFormat("#.##");
for (GroundAtom atom : Queries.getAllAtoms(db, SamePerson))
    println atom.toString() + "\t" + formatter.format(atom.getValue());

//////////////////////////// weight learning ///////////////////////////
Partition trueDataPartition = new Partition(2);
insert = data.getInserter(SamePerson, trueDataPartition)
InserterUtils.loadDelimitedDataTruth(insert, dir + "sn_align.txt");

Database trueDataDB = data.getDatabase(trueDataPartition, [samePerson] as Set);
MaxLikelihoodMPE weightLearning = new MaxLikelihoodMPE(m, db, trueDataDB, config);
weightLearning.learn();
weightLearning.close();

println ""
println "Learned model:"
println m

// close the Databases to flush writes
db.close();
trueDataDB.close();
*/
