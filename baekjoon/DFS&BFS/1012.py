"""
1h

백준 1012 - 유기농 배추

DFS, recursion

문제 개요: 배추를 해충으로부터 보호하기 위해 배추흰지렁이가 필요하다. 0은 배추가 심어져 있지 않은 땅이고 1은 배추가 심어져 있는 땅을 나타난다.

배추들이 모여있는 곳에는 배추 흰지렁이가 한마리만 있어도 상하좌우로 퍼진다. 각 테스트 케이스에 대해 필요한 최소의 배추흰지렁이 마리수 출력.

<O>
2차원 배열로 for문으로 돌면서 
배추가 있는 곳은 재귀 함수로 상하좌우 확인.
배열을 벗어나는 곳은 false 처리
배추가 있는 곳은 0으로 바꿔야 다시 방문 안함.
"""

import sys
sys.setrecursionlimit(10**6)

case = int(input())

def dfs(x,y):
    if x<0 or y<0 or x>=m or y>=n:
        return False
    if graph[x][y]==1:
        graph[x][y]=0
        dfs(x+1,y)
        dfs(x,y+1)
        dfs(x-1,y)
        dfs(x,y-1)
        return True
    return False


for i in range(case):
    m,n,k = map(int,input().split())
    graph=[[0]*n for _ in range(m)]
    for j in range(k):
        q,w = map(int,input().split())
        graph[q][w]=1

    result=0
    for t in range(m):
        for y in range(n):
            if dfs(t,y)==True:
                result+=1
    print(result)


    




