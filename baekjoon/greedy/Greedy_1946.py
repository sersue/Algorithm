import sys

n = int(input())

for i in range(n):
    result = 1
    book=[]
    applicant = int(input())
    for i in range(applicant):
        book.append(list(map(int,sys.stdin.readline().split())))
    book.sort()
    Max = book[0][1]
    for i in range(1,applicant):
            if Max > book[i][1]:
                Max = book[i][1]
                result +=1

    print(result)
