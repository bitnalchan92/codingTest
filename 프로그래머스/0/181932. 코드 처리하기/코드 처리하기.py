def solution(code):
    answer = ''
    mode = bool(0)
    
    for idx, val in enumerate(code):
        if val == '1':
            mode = not mode
            continue
        
        if mode == False:
            if idx % 2 == 0:
                answer += val
        else:
            if idx % 2 == 1:
                answer += val
    
    # print(answer)
    
    if answer == '':
        answer = 'EMPTY'
    
    return answer