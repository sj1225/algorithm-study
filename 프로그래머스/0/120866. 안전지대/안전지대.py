def solution(board):
    answer = 0
    
    n = len(board)
    
    for i, x in enumerate(board):
        for j, y in enumerate(x):
            if y == 1:
                for a in range(max(0, i-1), min(n, i+1+1)):
                    for b in range(max(0, j-1), min(n, j+1+1)):
                        board[a][b] = (1 if board[a][b] == 1 else 2)
                        
    for k in board:
        answer = answer + k.count(0)
    
    return answer