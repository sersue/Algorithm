number = []
for i in range(9):
    number.append(int(raw_input()))

for i in range(9):
    if number[i] == max(number):
        a = i

print('{}\n{}'.format(max(number),a+1))
