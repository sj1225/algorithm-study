def solution(n):
    answer = [[0 for y in range(0, n)] for x in range(0, n)]
    
    # 첫 줄 초기화
    answer[0] = [x for x in range(1, n+1)]
    
    x, y = 0, (n-1) # 좌표
    i = n + 1       # 들어갈 값
    j = 0           # 몇 번째 바퀴인지
    
    while i <= n ** 2:
        for a in range(j+1, n-j):
            answer[a][y] = i
            x = x + 1
            i = i + 1
        
        for a in range(n-j-2, j-1, -1):
            answer[x][a] = i
            y = y - 1
            i = i + 1
        
        for a in range(n-j-2, j, -1):
            answer[a][y] = i
            x = x - 1
            i = i + 1
        
        for a in range(j+1, n-j-1):
            answer[x][a] = i
            y = y + 1
            i = i + 1
        
        j = j + 1
        
    # debug
#    for a in answer:
#        print(a)
    
    return answer