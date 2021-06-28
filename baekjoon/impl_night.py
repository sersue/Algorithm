#c2 -> 6
position = input()
x=int(position[1])
#y좌표 숫자로 한줄 바꾸기 -> 내장함수 ord()
# y = int(ord(position[0]))-int(ord('a'))+1
rows = ['a','b','c','d','e','f','g','h']
L=[[1,2],[1,-2],[-1,2],[-1,-2],[2,1],[2,-1],[-2,1],[-2,-1]]

result =0
#y좌표 숫자로 바꾸기 
dy =0
for row in rows:
    dy+=1
    if position[0]==row:
        y=dy
        break;
nx=0
ny=0
for i in range(len(L)):
    nx=x
    ny=y
    nx = x+ int(L[i][0])
    ny = y+ int(L[i][1])
    if nx>=1 and ny>=1 and nx<=8 and ny<=8:
        result+=1
print(result)