def solution(order):
    answer = 0
    
    for o in order:
        if o.find("cafelatte") != -1:
            answer = answer + 5000
        else:
            answer = answer + 4500
    
    return answer