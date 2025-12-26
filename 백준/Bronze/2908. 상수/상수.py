nums = input().split()

num1 = list(nums[0])
num2 = list(nums[1])
num1.reverse()
num2.reverse()

# 리스트의 각 요소를 붙인 뒤, int로 바꿔야한다.
print(max([str.join('', num1), str.join('', num2)]))