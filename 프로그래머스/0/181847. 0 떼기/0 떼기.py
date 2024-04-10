def solution(n_str):
    for s in n_str:
        if s != '0':
            break
        
        n_str = n_str[1:]
        
    answer = n_str
    
    return answer