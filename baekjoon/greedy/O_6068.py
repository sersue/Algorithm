"""
1h ++

백준 6068 - 시간관리하기

문제 개요 : 농부는 하루에 N개의 일을 해야한다. 완성될때 필요한 시간 T, 끝내야하는 시간 S 가 주어진다.

제 시간에 끝낼 수 있게 결정하는 한도에서 농부가 가장 늦게 일어나도 되는 시간을 출력

존이 제 시간에 일을 끝낼 수 없을 때 -1을 출력한다


<O>
"내일 할거야" 문제와 유사.

제 시간에 일을 끝낼 수 없을때의 예외 처리 필요.

해결 -> 늦게 일어나도 되는 시간이 0 이거나 음수일 때 -1 출력 

"""


import sys
n = int(input())
farmthing =[]
for i in range(n):
    farmthing.append(list(map(int,sys.stdin.readline().split())))

farmthing.sort(key=lambda x:x[1],reverse=True)
work = farmthing[0][1]-farmthing[0][0]
for i in range(1,n):
    if work>=farmthing[i][1]:
        work = farmthing[i][1]-farmthing[i][0]
    else:
        work= work-farmthing[i][0]
if work <=0:
    print(-1)
    exit()
print(work)
        


