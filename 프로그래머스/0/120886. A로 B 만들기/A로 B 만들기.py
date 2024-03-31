def solution(before, after):
    answer = 0
    
    b = list(before)
    a = list(after)
    
    b = sorted(b)
    a = sorted(a)
    
    answer = ( 1 if a == b else 0 )
    
    return answer