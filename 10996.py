#//,/ 구분 하기 - 런타임에러
a = int(raw_input())
c =a//2
for i in range(1,a+1):
    if a%2==0:
        print('* '*c)
        print(' *'*c)
    elif a%2==1:
        print('* '*(c+1))
        print(' *'*c)