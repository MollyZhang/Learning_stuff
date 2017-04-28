learning to use crontab to schedule jobs following this tutorial:  
https://www.howtogeek.com/101288/how-to-schedule-tasks-on-linux-an-introduction-to-crontab-files/

#### in my crontab -e file, here is what I have to execute hello.py every minute:
#### !! all paths should be absolute path for crontab to work as intended
`* * * * * /Users/Molly/Desktop/Learning_stuff/linux_learning/cron/run.sh >> /Users/Molly/Desktop/Learning_stuff/linux_learning/cron/log.txt` 
