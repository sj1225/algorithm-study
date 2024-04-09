def solution(my_string):
    answer = 0
    
    my_string = [(x if ord(x) >= 48 and ord(x) <= 57 else ' ') for x in my_string]
    my_string = (''.join(my_string)).split(' ')
    my_string = [int(x) for x in my_string if x]
    answer = sum(my_string)
    
    return answer