File file = new File("data/gene.txt")
lines = file.readLines();

def genes = []
for (line in lines) {
    genes << line.split("\t")[0]
}
print genes

