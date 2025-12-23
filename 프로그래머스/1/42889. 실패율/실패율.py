def solution(N, stages):
    count_dict = {}
    for s in stages:
        count_dict[s] = count_dict.get(s, 0) + 1
    
    total_players = len(stages)
    fail_rates = {}
    
    for stage in range(1, N + 1):
        if total_players > 0:
            staying = count_dict.get(stage, 0)
            fail_rates[stage] = staying / total_players
            total_players -= staying
        else:
            fail_rates[stage] = 0
            
    answer = sorted(fail_rates, key=lambda x: fail_rates[x], reverse=True)
    return answer