T = int(input())

def factorial(x):
    init = 1
    for i in range(1,x+1):
        init *= i
    return init

for i in range(T):
    n,m = map(int,input().split())
    bridge = factorial(m)//(factorial(m-n) * factorial(n))
    print(bridge)




