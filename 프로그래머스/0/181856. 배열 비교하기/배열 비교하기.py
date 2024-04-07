def solution(arr1, arr2):
    answer = 0
    
    len1 = len(arr1)
    len2 = len(arr2)
    sum1 = sum(arr1)
    sum2 = sum(arr2)
    
    if len1 > len2:
        answer = 1
    elif len1 < len2:
        answer = -1
    else:
        if sum1 > sum2:
            answer = 1
        elif sum1 < sum2:
            answer = -1
        else:
            answer = 0
    
    return answer