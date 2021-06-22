def functionalProgramming(x,y):
    result = 0
    for i in range(len(x)):
        for j in range(len(y)):
            if x[i]<y[j]:
                result = result + x[i]**y[j]
    return int(result)

functionalProgramming([3,4,5],[2,4,6,8])