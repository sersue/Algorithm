N,K = map(int,input().split())
index = 0

while N!=1:
    if N%K==0:
        N = N//K
        index +=1

    else:
        N=N-1
        index +=1

print(index)
