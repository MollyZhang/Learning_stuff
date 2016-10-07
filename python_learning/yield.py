def yo_generator():
    for i in range(10):
        yield i, i**2, i**3


for i in yo_generator():
    print i




