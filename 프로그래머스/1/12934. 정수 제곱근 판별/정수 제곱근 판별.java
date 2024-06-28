class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double d = (double) Math.sqrt(n);
        long i = (long) d;
        
        if(d - i > 0){
            return -1;
        }
        
        return (i+1) * (i+1);
    }
}