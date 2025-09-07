str = input()
ret = ''

for chr in str:
    if chr.isupper():
        ret += chr.lower()
    else:
        ret += chr.upper()
        
print(ret)