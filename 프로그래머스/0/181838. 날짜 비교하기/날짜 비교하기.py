def solution(date1, date2):
    d1 = [ str(x) for x in date1 ]
    d2 = [ str(x) for x in date2 ]
    d1, d2 = ''.join(d1), ''.join(d2)
    
    answer = 1 if int(d1) < int(d2) else 0
    
    return answer