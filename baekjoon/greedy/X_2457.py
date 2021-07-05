"""
3h ++

백준 2457 - 공주님의 정원

Greedy 

문제 개요  - N개의 꽃이 있고 피고 지는 날이 주어진다 

3월 1일부터 11월 30일 까지 매일 꽃이 한가지 이상 피어있도록 해야하며 정원이 넓지 않으므로 정원에 심는 꽃들의 수를 가능한 적게 한다.

N개의 꽃들 중에서 조건을 만족하는 꽃을 선택할 때, 선택한 꽃들의 최소 개수 출력

[X]

주어진 날들을 1월 1일 : [1] ~ 12월 31일 [365] 사이의 숫자로 변환하여 푼다.

"""



import sys

accumulate = {1:0,2:31,3:59,4:90,5:120, 6:151, 7:181, 8:212, 9:243, 10:273, 11:304, 12:334}

def toaccumulate(month,day):
    return accumulate[month]+day

n = int(input())
flowers=[]
for i in range(n):
    start_month,start_day,end_month,end_day=map(int,sys.stdin.readline().split())
    flowers.append((toaccumulate(start_month,start_day),toaccumulate(end_month,end_day)))

#3/1
start = 60
#11/30
end = 334
flowers.sort()

x=-1
temp=0
changed=0
selected=[]
while start<=end and x<n:
    changed=0
    x+=1
    for i in range(x,n):
        # 4/12 : 102 > 3/1:60  ->  if changed ==1로 가서 조건 판단
        if flowers[i][0]>start:
            break
        if temp < flowers[i][1]:
            temp = flowers[i][1]
            x=i
            changed=1
    if changed==1:
        start=temp
        selected.append(flowers[x])
    else:
        selected=[]
        break
print(len(selected))


    







