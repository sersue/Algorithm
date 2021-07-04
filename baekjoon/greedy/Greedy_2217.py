n = int(input())
loop = []
result =[]

for i in range(n):
    loop.append(int(input()))

loop.sort()
for i in range(n):
    result.append(loop[n-(i+1)]*(i+1))

print(max(result))

