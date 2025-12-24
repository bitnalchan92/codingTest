import sys

# N = 바구니의 갯수, M = 공을 바꾸려는 횟수
N, M = map(int, sys.stdin.readline().split())
buckets = [number + 1 for number in range(N)]

for _ in range(M):
    i, j = map(int, sys.stdin.readline().split())
    buckets[i - 1], buckets[j - 1] = buckets[j - 1], buckets[i - 1]

for bucket in buckets:
    print(f'{bucket} ', end='')