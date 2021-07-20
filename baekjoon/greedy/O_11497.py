"""
1h ++

백준 11497 - 통나무 건너뛰기

문제 개요 : 높이가 {1,2,3,4,5}인 통나무들을 세우려고 한다. 가장 첫 통나무와 마지막 통나무는 인접해있다.

높이가 인접한 통나무들의 높이 차가 난이도 이다. 배열의 난이도를 낮게 하는 배열을 만든다.

각 테스트 케이스마다 한 줄에 주어진 통나무들로 만들 수 있는 최소 난이도를 출력.

그리디 + 정렬 

<O>

[2]-[0]을 하면 답이 나오는 쉬운 문제지만 

답으로 가는 배열을 만들어 정렬하여 뺄셈을 하려고 해서 시간이 오래걸렸다.

답 도출을 최우선으로 하는 방법을 생각해내자.
"""


import sys
n = int(input())


for i in range(n):
    m = int(input())
    logs=list(map(int,sys.stdin.readline().split()))
    logs.sort()
    result=[]
    for i in range(0,len(logs)-2):
        result.append(logs[i+2]-logs[i])
    result.append(logs[-1]-logs[-2])

    print(max(result))

    # temp=[]
    # temp1=[]
    # result=[]
    # heapq.heappush(result,logs)
    # while len(logs)>0:
    #     temp.append(heapq.heappop(logs))
    #     temp1.append(heapq.heappop(logs))
    #     print(temp)


    # temp1.sort(reverse=True)

    # for j in range(len(temp1)):
    #     temp.append(temp1[j])
    # print(temp)
    # if m %2 ==0:
    #     for j in range(0,m,2):
        

    # else:
    #     for j in range(m):
    #         if j==0 or j%2==0:
    #             level.append(logs[j])
    #         else:
    #             temp.append(logs[j])
    #     temp.sort(reverse=True)
    #     for t in range(len(temp)):
    #         level.append(temp[j])
        

# print(level)
