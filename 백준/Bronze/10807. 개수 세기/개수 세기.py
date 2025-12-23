import sys

size = int(input())
numbers = [int(n) for n in sys.stdin.readline().split()]
findNumber = int(input())

result = 0
for number in numbers:
    if findNumber == number:
        result += 1

print(result)