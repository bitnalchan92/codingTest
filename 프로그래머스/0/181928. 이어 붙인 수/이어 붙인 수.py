def solution(num_list):
    even_num = int(''.join(str(num) for num in num_list if num % 2 == 0))
    odd_num = int(''.join(str(num) for num in num_list if num % 2 != 0))
    
    return even_num + odd_num