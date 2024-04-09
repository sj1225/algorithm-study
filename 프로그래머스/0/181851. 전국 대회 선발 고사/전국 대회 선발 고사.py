def solution(rank, attendance):
    answer = 0
    
    # 등수, 학생번호
    array = [[x, i] for i, x in enumerate(rank) if attendance[i]]
    array = sorted(array)[:3]
    
    answer = 10000 * array[0][1] + 100 * array[1][1] + array[2][1]
    
    return answer