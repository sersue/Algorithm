n = int(input())
arr=[]
for i in range(n):
    arr.append(list(map(str,input())))

#길이순+ 역순으로 정렬
arr.sort(key=len)
arr.reverse()

num =9
isused={}

for i in range(n):
    for j in range(len(arr[i])):
        if arr[i][j] in isused:
            arr[i][j]=isused[arr[i][j]]
            continue
        if j == len(arr[i+1])-1:
            arr[i+1][0]=num
            num-=1
            arr[i][j]=num
            break
        isused[arr[i][j]]=num
        arr[i][j]=num
        num-=1

        

result=0
semi =''
for i in range(n):
    for j in range(len(arr[i])):
        arr[i][j]=str(arr[i][j])

for i in range(n):
    semi = ''.join(arr[i])
    result+=int(semi)
print(result)

    
