S = list(map(str,input()))
T = list(map(str,input()))

while len(T)!=len(S):
    if T[-1]=='A':
        T.pop()
    elif T[-1]=='B':
        T.pop()
        T.reverse()

if S==T:
    print(1)
else:
    print(0)