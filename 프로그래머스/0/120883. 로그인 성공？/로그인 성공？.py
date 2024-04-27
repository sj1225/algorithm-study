def solution(id_pw, db):
    answer = 'fail'
    
    
    
    if db.count(id_pw) == 1:
        answer = 'login'
    else:
        temp = [x for x in db if x[0] == id_pw[0]]
        
        if len(temp) == 1:
            answer = 'wrong pw'
        
    return answer