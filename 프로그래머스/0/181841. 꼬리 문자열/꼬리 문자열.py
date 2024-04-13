def solution(str_list, ex):
    str_list = [ x for x in str_list if x.find(ex) == -1]
    answer = ''.join(str_list)
    return answer