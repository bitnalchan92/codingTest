N, M = map(int, input().split())  # sys.stdin.readline().split()
numbers = [n for n in range(1, N + 1)]
# print(f'* before :: {numbers}')

for _ in range(M):
    i, j = map(int, input().split())

    while i < j:  # 인덱스 처리를 위해서 -1계산
        numbers[i - 1], numbers[j - 1] = numbers[j - 1], numbers[i - 1]
        i += 1
        j -= 1

# print(f'* after :: {numbers}')
for number in numbers:
    print(f'{number} ', end='')