import sys
n = int(input())
for i in range(n):
    mid=0
    result=0
    a0,b0,a1,b1 =0,0,0,0
    a,b = map(str,input().split())
    for j in range(len(a)):
        if a[j]!=b[j] and a[j]=='0' and b[j]=='1':
            a0+=1
            b1+=1
        elif a[j]!=b[j] and a[j]=='1' and b[j]=='0':
            a1+=1
            b0+=1
        if a0==b0==1 and a1==b1==1: 
            result+=1
            a0,b0,a1,b1 =0,0,0,0
    result += max(a0,a1)
    print(result)






