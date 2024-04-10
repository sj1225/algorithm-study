def solution(arr, delete_list):
    answer = [ x for x in arr if delete_list.count(x) == 0 ]
    return answer