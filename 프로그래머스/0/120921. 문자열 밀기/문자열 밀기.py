def solution(A, B):
    answer = -1
    
    l = len(A)
    
    for i in range(0, l):
        temp = A[(l-i):] + A[:(l-i)]
        
        if temp == B:
            answer = i
            break
    
    return answer