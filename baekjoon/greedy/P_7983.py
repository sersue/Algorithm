"""
2h ++

백준 7983 - 내일 할거야

문제 개요 : n 개의 과제 목록이 주어진다. 각 과제의 걸리는 시간, 제출일이 주어진다.

오늘은 0일이고 내일 1일부터 연속으로 최대 며칠동안 놀 수 있는지를 출력한다.

<P>

문제를 잘못 이해했다. 연속으로 놀 수 있는 최대일 수를 구하는 줄 알았는데

(1일 기준) 1일부터 최대 며칠동안 놀 수 있는지를 구하는 문제였다.

처음에 제출 했을 때 -> 시간초과
입력방식 sys.stdin.readline()으로 변경 -> 메모리 초과

푸는 방법이 틀림을 확인. 재이해 후 제출 

"""


import sys
n = int(input())
due=[]
for i in range(n):
    due.append(list(map(int,sys.stdin.readline().split())))

due.sort(key=lambda x:x[1],reverse=True)


now = due[0][1]-due[0][0]

for i in range(1,n):
    if now >= due[i][1]:
        now = due[i][1]-due[i][0]
    else:
        now = now-due[i][0]

print(now)

# duedate=due[0][1]
# result =[0 for i in range(duedate)]


# for i in range(n):
#     j = due[i][0]
#     for j in range(due[i][0]):
#         if due[i][1]-j not in result:
#             result[due[i][1]-j-1]=due[i][1]-j
#         else:
#             result[due[i][1]-j-2]=(due[i][1]-j-1)

# answer=0
# answers = []
# for i in range(len(result)):
#     if result[i]==0:
#         answer+=1
#     else:
#         answer=0
#     answers.append(answer)
# print(max(answers))

        
