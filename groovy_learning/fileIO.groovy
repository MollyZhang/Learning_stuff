File file = new File("data/gene.txt")

def genes = []
for (line in file.readLines()) {
    genes << line.split("\t")[0]
}
println genes

