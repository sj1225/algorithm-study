def solution(keyinput, board):
    answer = [0, 0]
    
    x_limit = int(board[0]/2)
    y_limit = int(board[1]/2)
    
    for k in keyinput:
        if k == 'left':
            answer[0] = max(answer[0] - 1, -1*x_limit)
        elif k == 'right':
            answer[0] = min(answer[0] + 1, x_limit)
        elif k == 'up':
            answer[1] = min(answer[1] + 1, y_limit)
        elif k == 'down':
            answer[1] = max(answer[1] - 1, -1*y_limit)
    
    return answer