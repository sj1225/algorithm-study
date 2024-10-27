def solution(sizes):
    answer = 0
    
    size1 = 0
    size2 = 0
    
    for w, h in sizes :
        size1 = max(size1, max(w, h))
        size2 = max(size2, min(w, h))
    
    return size1 * size2