# n,k = map(int,input().split())

# delnum = k

# while k>0:
#     k-=1
#     print('hi')


import heapq

queue=[1,2,3,4]
queue1=[]
heapq.heappush(queue1,queue)
print(queue1[0])

queue=[4,2,3,1]
print(queue1[0])
