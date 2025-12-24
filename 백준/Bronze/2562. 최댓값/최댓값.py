numbers = [0] * 9
for i in range(len(numbers)):
    numbers[i] = int(input())

maxValue = max(numbers)

result = 0
for number in numbers:
    result += 1
    if number == maxValue:
        break

print(maxValue)
print(result)