def solution(dots):
    # (x1, y1), (x2, y2)의 기울기
    a1 = (dots[1][1] - dots[0][1])
    a2 = (1 if (dots[1][0] - dots[0][0]) == 0 else (dots[1][0] - dots[0][0]))
    
    a = abs(a1 / a2)
    
    # (x3, y3), (x4, y4)의 기울기
    b1 = (dots[3][1] - dots[2][1])
    b2 = (1 if (dots[3][0] - dots[2][0]) == 0 else (dots[3][0] - dots[2][0]))
    
    b = abs(b1 / b2)
    
    # 기울기가 같으면 평행
    answer = (1 if (a == b) else 0)
    
    return answer