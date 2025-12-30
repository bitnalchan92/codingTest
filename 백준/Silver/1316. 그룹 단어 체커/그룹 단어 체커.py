word_cnt = int(input())
ret = 0
for _ in range(word_cnt):  # 단어의 갯수 만큼 반복문 수행
    w = input()

    exist_chr_hist = []  # 입력된 적이 있던 알파벳 철자를 보관하기 위한 list
    now_chr = ''
    is_group_word = True
    for idx in range(len(w)):
        if idx == 0:
            now_chr = w[idx]
            exist_chr_hist.append(now_chr)
            continue

        if now_chr == w[idx]:
            continue
        else:
            now_chr = w[idx]
            if now_chr in exist_chr_hist:
                is_group_word = False
                break
            else:
                exist_chr_hist.append(now_chr)

    # 결과 처리
    if is_group_word:
        ret += 1

print(ret)