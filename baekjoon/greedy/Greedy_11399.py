N = int(input())

ptime = list(map(int,input().split()))
ptime.sort()
result =0

for i in range(N):
    result += ptime[i]*(N-i)

print(result)