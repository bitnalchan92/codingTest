h, m = map(int, input().split())
remain_time = int(input())

temp_m = m + remain_time
if temp_m >= 60:
    plus_h = temp_m // 60 # 추가된 hour
    m = temp_m % 60 # 추가된 minute

    h += plus_h
    if h >= 24:
        h = h % 24
else:
    m = temp_m

print(f'{h} {m}')