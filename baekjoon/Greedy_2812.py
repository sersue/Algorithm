import sys
n,k = map(int,sys.stdin.readline().split())
num=list(map(int,sys.stdin.readline().strip()))

result=[]
delnum =k 
for i in range(n):
    while delnum>0 and result:
        if result[len(result)-1]<num[i]:
            result.pop()
            delnum-=1
        else:
            break
    result.append(num[i])

for i in range(n-k):
    print(result[i],end="")

