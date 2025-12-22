total_price = int(input())
obj_cnt = int(input())
temp = 0
for _ in range(obj_cnt):
    a, b = map(int, input().split())
    temp += a * b

if total_price == temp:
    print('Yes')
else:
    print('No')