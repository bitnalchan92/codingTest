import sys

N = map(int, sys.stdin.readline())
numbers = list(map(int, sys.stdin.readline().split()))

print(f'{min(numbers)} {max(numbers)}')