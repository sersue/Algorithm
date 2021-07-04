string = input()

number =0
sort =[]
#알파벳/숫자인지 확인하기

for s in string:
    if s.isdigit():
        number+=int(s)
    else:
        sort.append(s)

sort.sort()
result =''
#리스트를 문자열로 변환하여 출력 join 함수
for a in sort :
    result+=a
#print(''.join(result))
print(result+str(number))