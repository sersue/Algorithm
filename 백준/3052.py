number = []
remainder=[]
new_list =[]

for i in range(10):
    number.append(int(raw_input()))
for j in range(10):
    remainder.append(number[j]%42)

for k in remainder:
    if k not in new_list:
        new_list.append(k)

print(len(new_list))


