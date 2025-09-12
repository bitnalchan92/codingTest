def solution(a, d, included):
    answer = 0
    
    for idx, val in enumerate(included):
        if val:
            # print(a + (idx) * d) # 첫항은 a가 되야함...
            answer += a + idx * d

    return answer