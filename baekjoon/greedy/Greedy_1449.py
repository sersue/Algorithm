N,L=map(int,input().split())
broken = list(map(int,input().split()))
result=1
broken.sort()
start = broken[0]
end =broken[0]+L
for i in range(N):
    if start <= broken[i] < end:
        continue;
    else:
        result+=1
        start=broken[i]
        end=broken[i]+L

print(result)
