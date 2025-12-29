used_cnt = [0] * 26
c_list = list(input())

for c in c_list:
    subtract_n = 97
    if c.isupper():
        subtract_n = 65

    used_cnt[ord(c) - subtract_n] = used_cnt[ord(c) - subtract_n] + 1

max_cnt = max(used_cnt)
if used_cnt.count(max_cnt) > 1:
    print('?')
else:
    for idx, val, in enumerate(used_cnt):
        if val == max_cnt:
            print(chr(idx+65))