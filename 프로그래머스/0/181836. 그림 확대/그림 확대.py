def solution(picture, k):
    answer = []
    
    for p in picture:
        temp = ""
        for s in p:
            temp = temp + (s * k)
        
        for i in range(0, k):
            answer.append(temp)
    
    return answer