n = int(input())
plan = list(map(str,input().split()))

x,y = 1,1
for i in range(len(plan)):
    if plan[i]=='R' and y<5:
        x+= 0
        y+= 1
    elif plan[i]=='L' and x>1:
        x+= 0
        y+= -1
    elif plan[i]=='U' and x>1:
        x+= -1
        y+= 0
    elif plan[i] =='D' and y<5: 
        x+= 1
        y+= 0

print(x,y)


