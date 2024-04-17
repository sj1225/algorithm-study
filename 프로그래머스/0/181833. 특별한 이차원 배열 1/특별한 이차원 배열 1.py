def solution(n):
    answer = [ [(1 if x == y else 0) for y in range(0, n)] for x in range(0, n) ]
    
    return answer