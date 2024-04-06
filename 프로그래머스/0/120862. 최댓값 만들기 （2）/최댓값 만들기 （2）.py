def solution(numbers):
    answer = float("-inf")
    
    for i, n in enumerate(numbers):
        temp = numbers
        del temp[i]
        
        for m in temp:
            if answer < (n * m):
                answer = n * m
    
    return answer