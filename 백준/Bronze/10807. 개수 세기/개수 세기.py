import sys

rl = sys.stdin.readline
size = int(rl())
numbers = list(map(int, rl().split()))
findNumber = int(rl())

print(numbers.count(findNumber))