def solution(numlist, n):
    answer = []
    
    l = [ [ abs(n-x) + 0.5 if n-x > 0 else abs(n-x), x ] for x in numlist ]
    l = sorted(l)
    answer = [ l[i][1] for i in range(0, len(l)) ]
    
    return answer