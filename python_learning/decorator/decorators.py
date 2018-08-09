import time

def time_decor(thing):
    def time_decor_f(f):
        def f_wrapper(*args):
            t0 = time.time()
            f(*args)
            print("{0} takes {1:.2f} seconds".format(thing, time.time()-t0))
        return f_wrapper
    return time_decor_f