import sys

N, X = map(int, sys.stdin.readline().split())
numbers = list(map(int, sys.stdin.readline().split()))

for number in numbers:
    if X > number:
        print(f'{number} ', end='')