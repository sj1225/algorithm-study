def solution(triangle):
    # dp 계산용 배열 초기화
    dp = [[0]] * len(triangle)
    
    # 첫번째, 두번째 행 초기화 (거쳐간 숫자의 합의 최댓값)
    dp[0] = [triangle[0][0]]
    dp[1] = [dp[0][0] + triangle[1][0],
             dp[0][0] + triangle[1][1]]
    
    # 세번째 행부터 순회
    for i in range(2, len(triangle)) :
        # i번째 행 배열 초기화
        item = [0] * (i + 1)
        
        # i번째 행의 첫번째, 마지막 값 초기화
        item[0] = dp[i-1][0] + triangle[i][0]
        item[i] = dp[i-1][i-1] + triangle[i][i]
        
        # i번째 행의 중간 값 계산
        for j in range(1, i) :
            # 연결될 수 있는 두 경로중 최댓값과 합함
            item[j] = max(dp[i-1][j-1],dp[i-1][j]) + triangle[i][j]
        
        # i번째 행 배열 입력
        dp[i] = item
    
    # 최종 계산값 중 최댓값 반환
    return max(dp[len(triangle)-1])