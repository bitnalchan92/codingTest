d1, d2, d3 = map(int, input().split())
diceSet = {d1, d2, d3}
setSize = len(diceSet)

result = 0
if setSize >= 3:
    result = max(diceSet) * 100
elif setSize >= 2:
    temp = 0
    if d1 == d2:
        temp = d1
    elif d2 == d3:
        temp = d2
    elif d1 == d3:
        temp = d1

    result = 1000 + temp * 100
else:
    result = 10000 + diceSet.pop() * 1000

print(result)