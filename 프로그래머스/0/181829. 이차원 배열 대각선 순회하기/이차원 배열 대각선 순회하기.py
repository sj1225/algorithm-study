def solution(board, k):
    answer = 0
    
    a = len(board)
    b = len(board[0])
    
    for i in range(0, a):
        for j in range(0, b):
            if i + j <= k:
                answer = answer + board[i][j]
    
    return answer