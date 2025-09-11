def solution(n):
    answer = 0
    
    for num in range(1, n+1):
        if n % 2 == 0:
            answer += num**2 if num % 2 == 0 else 0
        else:
            answer += num if num % 2 != 0 else 0
    
    return answer