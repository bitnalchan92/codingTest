def solution(num_list):
    num1 = 1 # 모든 원소들의 곱
    num2 = 0 # 모든 원소들의 합
    
    for num in num_list:
        num1 *= num
        num2 += num
    else:
        num2 = num2 ** 2

    return 1 if num1 < num2 else 0