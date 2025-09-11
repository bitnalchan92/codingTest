def solution(n, k):
    # for num in range(1, n+1):
    #     if num % k == 0:
    #         answer.append(num)
    return [num for num in range(1, n+1) if num % k == 0]