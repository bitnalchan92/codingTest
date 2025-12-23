def solution(N, stages):
    # 스테이지 별로 각각의 스테이지에 몇명이 머물러 있는지 확인하기 위한 dict
    count_dict = {}
    for s in stages:
        count_dict[s] = count_dict.get(s, 0) + 1 # get함수를 통해 dict에 값이 없는 경우 0을 default값으로 사용할 수 있다
    
    total_players = len(stages) # 게임에 참여한 총 인원의 수 
    fail_rates = {} # 스테이지 별로 실패율을 관리하기 위한 dict
    
    # N으로 주어진 스테이지까지만 순회하면서, 실패율을 계산하기 시작
    for stage in range(1, N + 1):
        # 위에서 구해놓은 게임에 참여한 총 인원의 수를 분모로 두고,
        # 각 스테이지별로(반복문에서는 1스테이지부터 순회하게됨) 해당 스테이지에 머물러 있는 인원(staying)을 구한다.
        # 그렇게 되면 실패율을 계산할 수 있게 됨
        # 한번 순회를 수행 한뒤, 다음 스테이지의 게임 참여 인원에 이전 스테이지에 머물러 있는 사람들의 수는 필요가 없어지기 때문에
        # -= 처리를 해준다. 
        if total_players > 0:
            staying = count_dict.get(stage, 0)
            fail_rates[stage] = staying / total_players
            total_players -= staying
        else:
            fail_rates[stage] = 0
            
    # 가장 이해가 되지 않았던 lambda
    # 여기서는 dict를 정렬해서 list를 만드는 것인데, 정렬할때 그 기준을 key, value중 value를 기준으로 하기위해
    # key = lambda x: fail_rates[x]를 작성한 것이다. 
    # 그리고 내림차순으로 결과를 반환해야 하기 때문에 reverse=True를 추가
    answer = sorted(fail_rates, key=lambda x: fail_rates[x], reverse=True)
    return answer