a=int(input()) #시험 갯수
score=[]
for i in range(a):
    t=int(input())
    score.append(t)
maxscore = max(score)
for i in range(a):
    score[i]=(score[i]/maxscore)*100
print(sum(score)/a)

