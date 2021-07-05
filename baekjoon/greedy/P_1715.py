"""
2h ++

백준 1715 - 카드 정렬하기

greedy + 우선순위 큐

문제 개요 : 숫자 카드 두묶음 (A,B)을 합쳐서 하나로 만들기 위해서는 A+B번의 비교가 필요하다.

N개의 숫자 카드 묶음을 최소 번의 비교를 통해 하나로 만들기 위한 최소 비교 수를 출력.

<P>
1. 우선 순위 큐 사용하지 않고 품. -> 틀렸습니다.
2. 반례 생각 후 우선순위 큐로 구현 -> 틀렸습니다.
3. n==1일 때 비교수는 0 -> 맞았습니다.

문제의 반례

- input [ 10,10,10,10,10 ] 일 경우 -

우선순위 큐 사용 : [20,20,10] [20,30] [50]
아래 풀이 사용 : [20,30,40] [40,50] [90]

-> 배열에서 최소 값을 사용해야 할 때는 우선 순위 큐 사용.

"""

import sys
import heapq
n = int(input())
queue =[]

for i in range(n):
    heapq.heappush(queue,int(sys.stdin.readline()))

#한 묶음 일 때는 0번의 비교
if n==1:
    print(0)
else:
    result = 0
    while len(queue)>1:
        temp=0
        # 배열에서 최소값 두개 뽑아서 더하기
        for i in range(2):
            temp+=heapq.heappop(queue)
        result+=temp
        #더한 값 다시 큐에 넣기
        heapq.heappush(queue,temp)
    print(result)


# card.sort()
# package=[]

# if n==1:
#     print(card[0])
# elif n==2:
#     print(card[0]+card[1])
# else:
#     package.append(card[0]+card[1])
#     for i in range(2,n):
#         package.append(card[i]+package[i-2])
#     result=0
#     for i in range(len(package)):
#         result+=package[i]
#     print(result)


    