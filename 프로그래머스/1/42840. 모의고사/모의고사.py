def solution(answers):
    answer = []
    
    sol1 = [1, 2, 3, 4, 5]
    sol2 = [2, 1, 2, 3, 2, 4, 2, 5]
    sol3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    result1 = [ x for i, x in enumerate(answers) if x == sol1[i%len(sol1)] ]
    result2 = [ x for i, x in enumerate(answers) if x == sol2[i%len(sol2)] ]
    result3 = [ x for i, x in enumerate(answers) if x == sol3[i%len(sol3)] ]
    
    temp = [ len(result1), len(result2), len(result3) ]
    
    if temp[0] == max(temp):
        answer.append(1)
    if temp[1] == max(temp):
        answer.append(2)
    if temp[2] == max(temp):
        answer.append(3)
    
    return answer