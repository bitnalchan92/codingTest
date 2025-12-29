all_pieces = [1, 1, 2, 2, 2, 8]
remain_pieces = list(map(int, input().split()))

for idx in range(6):  # 체스 피스의 종류는 총 6가지
    print(all_pieces[idx] - remain_pieces[idx], end=' ')