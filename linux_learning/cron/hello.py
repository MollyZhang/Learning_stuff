import datetime
import os
path = os.path.abspath("./")
with open("{0}/hello_from_{1}".format(path, datetime.datetime.now()), "w") as f:
    f.write("hello")
    print("hello")
f.close()
