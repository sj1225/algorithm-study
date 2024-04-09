def solution(num_str):
    answer = 0
    
    num_str = [int(s) for s in num_str]
    answer = sum(num_str)
    
    return answer