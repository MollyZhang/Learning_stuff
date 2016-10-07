from sklearn.model_selection import KFold
import pandas as pd


df = pd.DataFrame(range(20))

print "data:\n", df
kf = KFold(n_splits=5, shuffle=True, random_state=0)

tests = []
trains = []

fold = 1
for train_idx, val_idx in kf.split(df):
    print "fold", fold
    print "train\n", df.iloc[train_idx]
    print "validation\n", df.iloc[val_idx]
    fold += 1
    trains += list(train_idx)
    tests += list(val_idx)

print "all tests:\n", sorted(tests)
print "all trains: \n", sorted(trains)
