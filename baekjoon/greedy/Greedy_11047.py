n,m = map(int,input().split())
coin = []

for i in range(n):
    coin.append(int(input()))

coin.reverse()
result =0
for i in coin:
    if m//i !=0:
        result = result + m//i
        m = m%i
print(result)
