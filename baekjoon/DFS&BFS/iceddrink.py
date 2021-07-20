"""
상하좌우를 살펴본 뒤에 0이면서 아직 방문하지 않았으면 방문해서 방문처리 한다.
방문 지점에서 다시 상하좌우를 보는 것이기 때문에 dfs 이다. stack,재귀
"""

a,b = map(int,input().split())
graph=[]
result=0

for i in range(a):
    graph.append(list(map(int,input())))

def dfs(x,y):
    if x<=-1 or x>=a or y<=-1 or y>=b:
        return False
    if graph[x][y]==0:
        graph[x][y]=1
        dfs(x-1,y)
        dfs(x,y-1)
        dfs(x+1,y)
        dfs(x,y+1)
        return True
    return False


for i in range(a):
    for j in range(b):
        if dfs(i,j)==True:
            # print('{0},{1}'.format(i,j))
            result+=1

print(result)