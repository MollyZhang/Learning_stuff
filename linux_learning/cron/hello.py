import datetime
path = "/Users/Molly/Desktop/Learning_stuff/linux_learning/cron"
with open("{0}/hello_from_{1}".format(path, datetime.datetime.now()), "w") as f:
    f.write("hello")
    print("hello")
f.close()
