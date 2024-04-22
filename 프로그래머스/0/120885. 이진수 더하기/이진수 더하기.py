def solution(bin1, bin2):
    answer = ''
    
    l = max(len(bin1), len(bin2))
    bin1, bin2 = bin1.rjust(l, '0'), bin2.rjust(l, '0')
    bin1, bin2 = bin1[::-1], bin2[::-1]
    bin3 = '0'
    
    i = 0
    while i < l:
        bin_sum = int(bin1[i]) + int(bin2[i]) + int(bin3)
        
        if bin_sum == 0:
            bin3 = '0'
            answer = answer + '0'
        elif bin_sum == 1:
            bin3 = '0'
            answer = answer + '1'
        elif bin_sum == 2:
            bin3 = '1'
            answer = answer + '0'
        elif bin_sum == 3:
            bin3 = '1'
            answer = answer + '1'
            
        i = i + 1
    
    answer = answer[::-1]
    
    if bin3 == '1':
        answer = '1' + answer
    
    return answer