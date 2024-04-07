def solution(dots):
    answer = 0
    
    max_dot = max(dots) # -----*
    min_dot = min(dots) # *-----
    
    width = max_dot[0] - min_dot[0]
    height = max_dot[1] - min_dot[1]
    
    answer = width * height
    
    return answer