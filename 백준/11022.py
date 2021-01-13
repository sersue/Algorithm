a = int(input())

for i in range(a):
    A,B= map(int,raw_input().split())
    print("Case #%d: %d + %d = %d"%(i+1,A,B,A+B))
