"""
2h ++

백준 1744 - 수 묶기

greedy + 배열 

문제 개요 : 길이가 N인 수열이 주어졌을 때 두 수를 묶어서 더한다.

어떤 두 수를 묶으면, 수열의 합을 구할 때 묶은 수는 서로 곱한 후에 더한다.

수열의 합이 최대가 되는 수를 출력.

<X>

오답 풀이 :
우선순위 큐에 오름차순으로 정렬해서 작은수를 두개 빼서 더함
조건문으로 양수 음수 일때 예외 처리 
조건문으로 홀수 배열 일때 앞 수를 결과값에 더해주고 짝수 길이의 배열로 만듬 -> 틀렸습니다.

문제의 반례
{-5,-4,-3} 
오답 풀이 = -5+12 =7
맞은 풀이 = 20-3 =17

정답 풀이 :
0,1은 다른 배열에 따로 저장해주고 , 양수와 음수는 각각의 배열에 저장 

->비교해야할 조건문이 많아지면 따로 나누어 생각하기.

"""
import sys
n = int(input())
arr=[]
for i in range(n):
    arr.append(int(sys.stdin.readline()))

minus=[]
plus=[]
nn=[]

#양수, 음수, [0,1] 3개의 배열로 분리 
for num in arr:
    if num<0:
        minus.append(num)
    elif num>1:
        plus.append(num)
    else:
        nn.append(num)

# 양수는 내림차순 음수는 오름차순
minus.sort()
plus.sort(reverse=True)
result = 0

#음수 배열 
if len(minus)%2==0:
    for i in range(0,len(minus)-1,2):
        result+= minus[i]*minus[i+1]
if len(minus)%2!=0:
    for i in range(0,len(minus)-1,2):
        result+=minus[i]*minus[i+1]
    #nn에 0이 없으면 더해줌. 0이 있으면 0과 곱해 0이므로 더하지 않음.
    if 0 not in nn:
        result+=minus[-1]    

#양수배열 
if len(plus)%2==0:
    for i in range(0,len(plus)-1,2):
        result+=plus[i]*plus[i+1]
if len(plus)%2!=0:
    #곱하여 더해준 후 남은 숫자는 더함.
    for i in range(0,len(plus)-1,2):
        result+=plus[i]*plus[i+1]
    result+=plus[-1]

#nn에 1이 남아있으면 더해주기
result+=sum(nn)

print(result)



