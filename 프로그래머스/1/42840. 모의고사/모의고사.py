def solution(answers):
    supo_scores = [0] * 3
    supo_patterns = [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ]
    
    for i, answer in enumerate(answers):
        # print(f"i : {i}, answer : {answer}")
        for j, pattern in enumerate(supo_patterns):
            # print(f"======== j : {j}, pattern : {pattern}, len(pattern) : {len(pattern)},,, i % len(pattern) = {i % len(pattern)}")
            
            # print("======================> answer : ", answer)
            # print("======================> supos답 : ", pattern[i%len(pattern)])
            
            if answer == pattern[i % len(pattern)]:
                supo_scores[j] += 1

    # print(supo_scores)
    max_score = max(supo_scores)
    # print(max_score)
    
    highest_scores_supo = []
    for i, score in enumerate(supo_scores):
        if max_score == score:
            highest_scores_supo.append(i+1)
            
    return highest_scores_supo
                
    answer = []
    return answer