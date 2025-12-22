h, m = map(int, input().split())

if m >= 45:
    m = m - 45
else:
    m = 60 - (45 - m)
    h -= 1

    if h < 0:
        h = 24 - abs(h)

print(f'{h} {m}')