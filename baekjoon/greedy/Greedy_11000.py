#시간초과 
# n = int(input())
# schedule =[]
# for i in range(n):
#     schedule.append(list(map(int,sys.stdin.readline().split())))

# result =n
# for i in range(1,n):
#     for j in range(n):
#         if schedule[i][0] == schedule[j][1]:
#             schedule[j][1]= schedule[i][1]
#             result-=1
#         elif schedule[j][0]<=schedule[i][0]<=schedule[j][1]:
#             continue
# print(result)
    
import sys
import heapq

n = int(input())
schedule =[]
for i in range(n):
    schedule.append(list(map(int,sys.stdin.readline().split())))
schedule.sort(key=lambda x:x[0])

queue=[]
heapq.heappush(queue,schedule[0][1])

for i in ragne(1,n):
    if queue[0]> schedule[i][0]:
        heapq.heappush(queue,schedule[i][1])
    else:
        heapq.heappop(queue)
        heapq.heappush(queue,schedule[i][1])
print(len(queue))
    
