def solution(sides):
    answer = 0
    
    a = max(sides)
    b = min(sides)
    
    # c가 가장 긴 변인 경우 -> c < a + b
    c1 = list(range(a+1, a+b))
    
    # a가 가장 긴 변인 경우 -> a < b + c
    c2 = list(range(a-b+1, a+1))
    
    answer = len(c1) + len(c2)
    
    return answer