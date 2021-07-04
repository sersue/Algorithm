n=int(input())
crane = list(map(int,input().split()))
k=int(input())
box = list(map(int,input().split()))

result=0
crane.sort(reverse=True)
box.sort(reverse=True)

if box[0]>crane[0]:
    print(-1)
    exit()

result=0
while len(box)!=0:
    result+=1
    for i in crane:
        for j in range(len(box)):
            if box[j]<=i:
                print(box[j])
                del box[j]
                break

print(result)



