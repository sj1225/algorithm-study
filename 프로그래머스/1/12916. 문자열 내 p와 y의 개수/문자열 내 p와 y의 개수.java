class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        s = s.toLowerCase();
        
        long p = s.chars().filter(c -> c == 'p').count();
        long y = s.chars().filter(c -> c == 'y').count();
        
        if((p==0)&&(y==0)){
            answer = true;
        }else if(p==y){
            answer = true;
        }
        
        return answer;
    }
}