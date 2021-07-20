

# n= int(input())

def rec(m):
    print(m)
    if m<=1:
        return m
    return rec(m-1)+rec(m-2)

print(rec(2))