cro_alpha = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
w = input()
result = 0

for c in cro_alpha:
    if c in w:
        result += w.count(c)
        w = w.replace(c, ' ')

print(result + len("".join(w.split())))