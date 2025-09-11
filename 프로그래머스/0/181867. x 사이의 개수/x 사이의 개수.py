def solution(myString):
    lst = myString.strip().split('x')
    
    return [len(s) for s in lst]
