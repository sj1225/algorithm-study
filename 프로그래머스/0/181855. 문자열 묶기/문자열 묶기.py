def solution(strArr):
    answer = 0
    temp = [0 for x in range(0,31)]
    
    for arr in strArr:
        n = len(arr)
        temp[n] = temp[n] + 1
    
    answer = max(temp)
    
    return answer