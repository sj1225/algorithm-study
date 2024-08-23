class Solution {
    int[] arr = new int[100001];
    
    public int solution(int n) {
        return fibonacci(n) % 1234567;
    }
    
    private int fibonacci(int a) {
        if(a <= 1) return arr[a] = a;
        
        if(arr[a] > 0) return arr[a] % 1234567;
        
        arr[a] = (fibonacci(a - 1) + fibonacci(a - 2)) % 1234567;
        
        return arr[a];
    }
}