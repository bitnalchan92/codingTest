numbers = []
for _ in range(10):
    numbers.append(int(input()))

s = set()
for number in numbers:
    rest = number % 42
    s.add(rest)

print(len(s))