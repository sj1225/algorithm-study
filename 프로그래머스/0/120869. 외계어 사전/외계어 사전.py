def solution(spell, dic):
    answer = 2
    
    tempSpell = ''.join(sorted(spell))
    
    for d in dic:
        temp = ''.join(sorted(d))
        
        if temp == tempSpell:
            answer = 1
    
    return answer