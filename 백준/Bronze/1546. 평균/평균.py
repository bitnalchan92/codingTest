N = int(input())
scores = [score for score in map(int, input().split())]

M = max(scores)
total_score = 0
for score in scores:
    total_score += score / M * 100

print(total_score / N)