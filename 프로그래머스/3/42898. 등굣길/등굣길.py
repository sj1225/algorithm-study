def solution(m, n, puddles):
    m += 1
    n += 1
    
    dp = [[0 for col in range(m)] for row in range(n)]
    dp[1][1] = 1
    
    for y in range(1, n):
        for x in range(1, m):
            if [x, y] in puddles :
                continue
            
            b1 = dp[y-1][x]
            b2 = dp[y][x-1]
            
            if [x, y-1] in puddles :
                b1 = 0
            
            if [x-1, y] in puddles :
                b2 = 0
            
            dp[y][x] += b1 + b2

    return dp[n-1][m-1] % 1000000007