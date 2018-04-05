import multiprocessing

def f(*args):
    print(args)
    return sum([i for i in args[0]])


p = multiprocessing.Pool(2)
print(p.map(f, [[1,2,3],[2,2],[10,20,30]]))


p.terminate()
