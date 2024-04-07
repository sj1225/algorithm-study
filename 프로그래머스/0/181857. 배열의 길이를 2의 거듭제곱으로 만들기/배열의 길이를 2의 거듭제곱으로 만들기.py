def solution(arr):
    answer = arr
    
    l = len(arr)
    
    if l == 1:
        return answer
    
    for i in range(1, 12):
        if 2**i < l:
            continue
        else:
            for j in range(0, 2**i - l):
                answer.append(0)
            break
    
    return answer