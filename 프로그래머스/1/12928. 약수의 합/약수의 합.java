import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> yaksu = new ArrayList<>();
        
        if(n == 0){
            return 0;
        }
        
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                yaksu.add(i);
                //yaksu.add(n/i);
            }
        }
        
        answer = yaksu.stream().mapToInt(Integer::intValue).sum();
        
        return answer;
    }
}