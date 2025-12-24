import sys

# N = 바구니의 갯수, M = 공을 넣으려는 횟수
N, M = map(int, sys.stdin.readline().split())

buckets = [0] * N
for _ in range(M):
    i, j, k = map(int, sys.stdin.readline().split())
    for n in range(i - 1, j):  # 사람이 말하는 몇번째 바구니와, 리스트의 인덱스의 시작번호 차이 고려
        buckets[n] = k

for bucket in buckets:
    print(f'{bucket} ', end='')