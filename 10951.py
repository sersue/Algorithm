#test case 몇개인지 몰라서 try except
while True:
    try:
        a, b = map(int,input().split())
        print(a+b)
    except:
        break