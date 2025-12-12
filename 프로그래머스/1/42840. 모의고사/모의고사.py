# def solution(answers):
#     ret = [] # 반환될 리스트
    
#     # 학생들의 정답 패턴 추출
#     student1_answer_pattern = [1, 2, 3, 4, 5]
#     student2_answer_pattern = [2, 1, 2, 3, 2, 4, 2, 5]
#     student3_answer_pattern = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
#     # 학생들이 정답을 몇개나 맞췄는지 확인하기 위한 변수
#     student1_cnt = 0
#     student2_cnt = 0
#     student3_cnt = 0
    
#     # 문제의 수만큼(답안지의 길이)만큼 순회 시작
#     for idx in range(len(answers)):
#         # n번 문제의 답
#         answer = answers[idx]
        
#         # 학생들의 답안
#         student1_answer = student1_answer_pattern[idx % len(student1_answer_pattern)] 
#         student2_answer = student2_answer_pattern[idx % len(student2_answer_pattern)]
#         student3_answer = student3_answer_pattern[idx % len(student3_answer_pattern)]
        
#         # 정답인 경우 cnt++
#         if student1_answer == answer:
#             student1_cnt += 1
#         if student2_answer == answer:
#             student2_cnt += 1
#         if student3_answer == answer:
#             student3_cnt += 1
    
#     # 학생별 맞힌 정답의 수를 보관한 리스트
#     scores = [student1_cnt, student2_cnt, student3_cnt]
#     # 가장 높은 점수 추출
#     max_scores = max(scores)
    
#     # 학생별 점수표를 순회하며, 가장 높은 점수와 동일한 점수를 갖고 있는 학생의 경우 ret에 append
#     for idx in range(len(scores)):
#         if max_scores == scores[idx]:
#             ret.append(idx+1)
    
#     return ret


def solution(answers):
    # 수포자들 패턴
    patterns = [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ]
    
    # 수포자들 점수 보관 리스트
    scores = [0] * 3
    
    # 순회하며 각 수포자들이 정답을 얼마나 맞췄는지 확인
    for i, answer in enumerate(answers):
        for j, pattern in enumerate(patterns):
            if answer == pattern[i % len(pattern)]:
                scores[j] += 1
            
    # 가장 높은 점수 추출
    max_scores = max(scores)
    
    # 가장 높은 점수를 가진 수포자들 번호 찾아 리스트에 담음
    highest_scores = []
    for i, score in enumerate(scores):
        if max_scores == score:
            highest_scores.append(i+1)
    
    return highest_scores
