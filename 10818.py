#list(map(int,input().split()))와 map(int,input().split())
a = int(raw_input())
numbers = list(map(int,raw_input().split()))
print('{} {}'.format(min(numbers),max(numbers)))