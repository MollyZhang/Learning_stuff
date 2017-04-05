""" example script of multiprocessing module in python"""

import multiprocessing
import time


def f(s):
    for i in range(10**7):
        1 == 1 + 2
    print(s, end="")


def single_thread():
    t0 = time.time()
    letters = "ABCDEFG"
    for letter in letters:
        f(letter)
    return time.time() - t0


def multi_thread(n_threads):
    t0 = time.time()
    p = multiprocessing.Pool(n_threads)
    p.map(f, "ABCDEFG")
    return time.time() - t0


def main():
    print("\nsingle thread run time %s" %single_thread())
    for n in range(1, 21):
        print("multiple thread run time with %d thread is %s" %(n, multi_thread(n)))



if __name__ == "__main__":
    main()
