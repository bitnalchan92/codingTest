def solution(num_list):
    last_val = num_list[-1]
    last_before_val = num_list[-2]
    
    if last_val > last_before_val:
        num_list.append(last_val - last_before_val)
    else:
        num_list.append(last_val * 2)
    
    return num_list