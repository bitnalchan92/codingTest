# def solution(numbers):
#     answer = []
    
#     for i in range(len(numbers)): # 조합을 구하기 위해 순회
#         for j in range(len(numbers)):
#             # 서로 다른 인덱스의 두 수를 뽑아야 한다. 
#             if i == j:
#                 continue
            
#             sum = numbers[i] + numbers[j]
#             answer.append(sum)
    
#     # set을 이용한 중복제거
#     answer = list(set(answer))
#     answer.sort()
    
#     return answer

def solution(numbers):
    answer = []
    
    for i in range(len(numbers)): # 조합을 구하기 위해 순회
        for j in range(i+1, len(numbers)):
            answer.append(numbers[i] + numbers[j])
    
    # set을 이용한 중복제거
    answer = sorted(set(answer))
    
    return answer
