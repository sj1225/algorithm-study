class Solution {
    public long solution(int a, int b) {
        long x = Math.min(a, b);
        long y = Math.max(a, b);
        
        long answer = ((x + y) * (y - x + 1) / 2);
        
        return answer;
    }
}