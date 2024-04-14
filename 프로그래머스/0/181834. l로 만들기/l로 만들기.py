def solution(myString):
    answer = [('l' if ord(s) <= 108 else s) for s in myString]
    answer = ''.join(answer)
    return answer