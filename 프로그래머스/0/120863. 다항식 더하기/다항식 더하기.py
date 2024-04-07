def solution(polynomial):
    answer = ''
    
    temp_input = polynomial.split(' + ')
    temp_output = [0, 0]
    
    for t in temp_input:
        if t[-1] == 'x':
            temp_output[0] = temp_output[0] + int(1 if t[:-1] == '' else t[:-1])
        else:
            temp_output[1] = temp_output[1] + int(t)
    
    flag1, flag2 = (temp_output[0] != 0), (temp_output[1] != 0)
    
    answer = ( 
                ((str(temp_output[0] if temp_output[0] != 1 else '') + 'x') if flag1 else '')
              + (' + ' if (flag1 and flag2) else '')
              + (str(temp_output[1]) if flag2 else '')
             )
    
    return answer