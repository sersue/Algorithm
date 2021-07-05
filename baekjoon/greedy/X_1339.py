"""
3h++

백준 1339 - 단어수학

그리디
 
문제 개요 : 단어수학 문제는 N개의 단어로 이루어져 있으며, 각 단어는 알파벳 대문자로만 이루어져 있다.

이때 각 알파벳 대문자를 0부터 9까지의 숫자 중 하나로 바꿔서 N개의 수를 합한다. 같은 알파벳은 같은 숫자로 바꿔야 한다. 

N개의 단어로 그 수의 합을 최대로 만드는 수를 출력.

<X>
dictionary 사용은 예상했지만 각 문자의 길이에 따라 바로 t를 부여하려고 함. -> 조건문이 많아짐 

자리수를 계산하여 배열에 넣고 후에 숫자를 곱하는 로직을 생각하지 못함.

이러한 단어 문제는 자리수 계산을 떠올릴 것.
"""


n = int(input())
words=[]
for i in range(n):
    words.append(input())

isused={}
for word in words:
    k=len(word)-1
    for j in word:
        # N 단어의 len만큼 돌며 dictionary에 그 단어가 있는지 확인하고 자리수 더하기
        if j in isused:
            isused[j]+=pow(10,k)
        else:
            isused[j]=pow(10,k)
        k-=1

# 단어별 자리수 값 저장 
"""
ex.
{'a':1000,'b':1010,'c':100}
[1000,1010,100]
"""
nums=[]
for value in isused.values():
    nums.append(value)


#내림차순 * 9,8,7...
nums.sort(reverse=True)

result,t = 0,9
for i in range(len(nums)):
    result+=nums[i]*t 
    t-=1
print(result)
    
