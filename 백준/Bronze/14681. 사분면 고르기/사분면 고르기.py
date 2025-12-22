pointX = int(input())
pointY = int(input())

if pointX > 0:
    if pointY > 0:
        print(1)
    else:
        print(4)
else:
    if pointY > 0:
        print(2)
    else:
        print(3)