def solution(array, commands):
    answer = []
    
    for command in commands:
        c1 = command[0]-1
        c2 = command[1]
        c3 = command[2]-1
        
        c = sorted(array[c1:c2])
        c = c[c3]
        
        answer.append(c)
    
    return answer