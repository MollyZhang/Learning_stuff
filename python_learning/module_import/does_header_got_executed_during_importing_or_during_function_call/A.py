
X = 1
for i in range(1, 10**5):
    X = X * i
print("from header", len(str(X)))






def simple_f():
    print('from imported func', len(str(X)))
