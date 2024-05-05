def solution(chicken):
    coupon = chicken
    answer = 0
    
    while coupon >= 10:
        service = int(coupon/10)
        answer += service
        coupon = coupon - (service * 9)
    
    return answer