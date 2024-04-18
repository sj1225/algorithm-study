def solution(arr):
    answer = []
    
    row = len(arr)
    col = len(arr[0])
    
    if row > col:
        for a in arr:
            temp = a
            for i in range(0, row-col):
                temp.append(0)
            answer.append(temp)
    elif row < col:
        answer = arr
        temp = [ 0 for x in range(0, col)]
        for i in range(0, col-row):
            answer.append(temp)
    else:
        answer = arr
    
    return answer