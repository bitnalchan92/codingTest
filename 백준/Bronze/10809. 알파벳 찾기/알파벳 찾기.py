l = [-1] * 26
word = input()

for idx in range(len(l)):
    c = chr(idx + 97)

    if c in word:
        # print(f'{c} :: {word.index(c)}')
        l[idx] = word.index(c)

# 결과 출력
for n in l:
    print(f'{n} ', end='')