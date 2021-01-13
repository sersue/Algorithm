hour,min = map(int,raw_input().split())

min = min - 45

if min < 0 :
    min =min + 60
    hour =hour - 1
    if hour<0:
        hour =hour +24
    print (hour , min)
else :
    print (hour,min)