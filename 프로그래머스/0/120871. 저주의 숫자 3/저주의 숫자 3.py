def solution(n):
    answer = 1
    
    for i in range(2, n+1):
        answer += 1
        
        while (str(answer).count('3') > 0) or (answer % 3 == 0):
            answer += 1
    
    return answer