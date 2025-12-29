w = input()
start_idx, end_idx = 0, len(w) - 1
result = 1
while start_idx < end_idx:  # 가운데 문자는 비교할 필요 없음
    if not w[start_idx] == w[end_idx]:
        result = 0
        break

    start_idx += 1
    end_idx -= 1

print(result)