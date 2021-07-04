n = int(input())

arr =[]
for i in range(n):
    arr.append(list(map(int,input().split())))

k = 2
for i in range(1,n): #1,2,3,4
    for j in range(k): # 0,1
        if j==0:
            arr[i][j]=arr[i][j]+arr[i-1][j]
        elif i ==j:
            arr[i][j]=arr[i][j]+arr[i-1][j-1]
        else:
            arr[i][j]=max(arr[i-1][j],arr[i-1][j-1])+arr[i][j]
        
    k+=1
print(max(arr[n-1]))


