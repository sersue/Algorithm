S = input()
T = input()

can = 1
cannot =0
if S==T[0:len(S)]:
    if T[len(S)]=='B':
        print(can)
    else:
        print(cannot)
else: 
    S+''