#12223
N = int(input())

adventure = []
adventure=list(map(int,input().split()))
adventure.sort()

result =0
count =0

for i in adventure:
    count+=1
    if count>=i:
        result +=1
        count=0

print(result)
    



