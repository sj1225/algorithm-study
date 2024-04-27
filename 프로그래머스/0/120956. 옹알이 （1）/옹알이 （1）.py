def solution(babbling):
    answer = 0
    
    for b in babbling:
        temp = b.replace("aya", "*").replace("ye", "*").replace("woo", "*").replace("ma", "*").replace("*", "")
        
        if len(temp) == 0:
            answer = answer + 1
        
    return answer