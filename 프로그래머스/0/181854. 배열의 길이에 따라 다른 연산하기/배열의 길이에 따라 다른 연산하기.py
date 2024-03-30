def solution(arr, n):
    answer = []
    
    l = len(arr)
    
    if l%2==1:
        answer = [ ( x + n if i%2 == 0 else x ) for i, x in enumerate(arr) ]
    else:
        answer = [ ( x + n if i%2 == 1 else x ) for i, x in enumerate(arr) ]
        
    return answer