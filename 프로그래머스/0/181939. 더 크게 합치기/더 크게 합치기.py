def get_join_number(num1, num2):
    return int(str(num1) + str(num2))   

def solution(a, b):
    num1 = get_join_number(a, b)
    num2 = get_join_number(b, a)
    
    return max(num1, num2) if num1 != num2 else num1