awk 'BEGIN{printf "Sr No\tName\tSub\tMarks\n"} {print}' marks.txt 
#output: 
#Sr No   Name    Sub Marks
#1)  Amit    Physics  80
#2)  Rahul   Maths    90
#3)  Shyam   Biology  87
#4)  Kedar   English  85
#5)  Hari    History  89

awk '/ul/ {print $0}' marks.txt 
# note: $0 designate the whole line, while $1, $2 designate column 1, column2 etc
#output: 
#2)  Rahul   Maths    90

