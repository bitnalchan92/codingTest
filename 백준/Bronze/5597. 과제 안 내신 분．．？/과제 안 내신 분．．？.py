import sys

submitted_students = [0] * 28
for i in range(len(submitted_students)):
    submitted_students[i] = int(sys.stdin.readline())
sorted(submitted_students)

# not_submitted_students = [0] * 2
for i in range(30):
    if i + 1 in submitted_students:
        continue
    else:
        # not_submitted_students[i] = i + 1
        print(i + 1)