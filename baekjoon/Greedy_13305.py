city = int(input())
distance = list(map(int,input().split()))
oilPrice = list(map(int,input().split()))

result=distance[0]*oilPrice[0]
Min = oilPrice[0]
dist = 0
for i in range(1,len(distance)):
    if Min<=oilPrice[i]:
        dist += distance[i]
    else :
        result += Min * dist
        dist = distance[i]
        Min = oilPrice[i]
    if i == city-2:
        result+=dist*Min
print(result)


