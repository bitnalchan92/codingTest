def solution(arr1, arr2):
    # 두 input의 행과 열의 길이 구하기 
    r_1, c_1 = len(arr1), len(arr1[0])
    r_2, c_2 = len(arr2), len(arr2[0])
    # print(f"arr1 : {r_1}행 {c_1}열")
    # print(f"arr2 : {r_2}행 {c_2}열")
    
    # case1의 경우 
    # 3행(r_1) 2열(c_1) * 2행(r_2) 2열(c_2)의 결과는 3행 2열이 된다. (행렬의 곱셈 참고!)
    # 결과물을 담을 리스트 만들어두기
    answer = [ [0] * c_2 for _ in range(r_1) ]
    # print(answer)
    
    #===============================================================================================================
    for i in range(r_1): # 결과물의 행 길이만큼 반복
        for j in range(c_2): # 결과물의 열 길이만큼 반복
            for x in range(r_2):
                # answer[i][j]
                # (arr1[0][0] * arr2[0][0])       x가 0일때...
                #   + (arr1[0][1] * arr2[1][0])   다음회차가되서 x가 1일때...
                answer[i][j] += arr1[i][x] * arr2[x][j]
                
                # 첫번째 행의 열의 갯수만큼 모두 연산이 마무리되면 다음행의 첫번째열로 이동해서 또 연산을 하게됨...
    
    return answer