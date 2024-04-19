def solution(arr):
    answer = 1
    
    n = len(arr)
    
    for i in range(0, n):
        for j in range(0, n):
            if arr[i][j] != arr[j][i]:
                return 0
    
    return answer