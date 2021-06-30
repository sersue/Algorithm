horizon,vertical = map(int,input().split())
n = int(input())
market=[]
for i in range(n):
    market.append(list(map(int,input().split())))
x,y = map(int,input().split())
result=0

for i in range(n):
    if market[i][0]==x:
        result += abs(market[i][1]-y)
    elif abs(market[i][0]-x)==1:
        result+=y+vertical+market[i][1]
    else:
        result+=y+(vertical-market[i][1])

print(result)