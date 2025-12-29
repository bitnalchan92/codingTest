N = int(input())
line_cnt = 2 * N - 1

star_cnt = 1
space_cnt = N - 1
for n in range(line_cnt):
    print(' ' * space_cnt, '*' * star_cnt, sep='') # 별 출력하는 부분

    if n + 1 < N:
        star_cnt += 2
        space_cnt -= 1
    else:
        star_cnt -= 2
        space_cnt += 1