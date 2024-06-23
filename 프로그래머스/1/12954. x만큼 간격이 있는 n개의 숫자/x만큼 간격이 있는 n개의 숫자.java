import java.util.*;

class Solution {
    public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<Long>();
        
        for(long i=0;i<n;i++){
            answer.add(x + x * i);
        }
        
        return answer;
    }
}