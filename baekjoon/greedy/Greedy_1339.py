n = int(input())
words=[]
for i in range(n):
    words.append(input())

#딕셔너리 사용
isused={}
for word in words:
    k=len(word)-1
    for j in word:
        if j in isused:
            isused[j]+=pow(10,k)
        else:
            isused[j]=pow(10,k)
        k-=1

print(isused) 
nums=[]
for value in isused.values():
    nums.append(value)

nums.sort(reverse=True)
print(nums)

result,t = 0,9
for i in range(len(nums)):
    result+=nums[i]*t 
    t-=1
print(result)
    
