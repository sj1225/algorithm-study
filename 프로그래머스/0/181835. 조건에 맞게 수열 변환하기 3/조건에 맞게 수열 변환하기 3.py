def solution(arr, k):
    answer = [(a * k if k%2==1 else a + k ) for a in arr]
    return answer