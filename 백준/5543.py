burger_price=[]
beverage_price=[]
total= 0

for i in range(3):
    c = int(raw_input())
    burger_price.append(c)
for i in range(2):
    c = int(raw_input())
    beverage_price.append(c)

total = min(burger_price)+min(beverage_price) - 50
print (int(total))

