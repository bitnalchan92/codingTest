def solution(numbers):
    result = [] # list init
    for idx_i, i in enumerate(numbers):
        # print(idx, "===", i)
        for idx_j, j in enumerate(numbers):
            if idx_i != idx_j:
                result.append(i + j)
                
    unique_result = list(set(result))
    unique_result.sort()
    return unique_result