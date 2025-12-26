dial_info = ['', '', '', 'ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

input_data = input()  # 알파벳 대문자로 이루어진 단어만 주어짐
time = 0  # 전화를 걸기위해 필요한 최소 시간, 숫자 1을 걸기위해 2초가 필요하고, 그림의 알파벳은 2부터 작성되어 있기 때문에 어떤 알파벳을 누르든 무조건 2초가 추가된 시간만큼 걸린다.

for i in list(input_data):
    # print('===', i)
    # dict의 각각의 value에 값이 있는지 체크를 하고, 해당하는 key에 +1을 하여 시간 계산을 하면될듯 한데...
    for idx, value in enumerate(dial_info):
        # print(idx, value)
        if i in value:
            # print('찾은 ::', idx, value)
            time += idx

print(time)