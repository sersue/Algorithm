#02984
#567

#0,1 일때는 더하기 그외는 곱하기
string = input()
result =int(string[0])

for i in range(1,len(string)):
    num = int(string[i])
    if result<=1 or num <=1:
        result = result + num
    else:
        result=result*num

print(result)





