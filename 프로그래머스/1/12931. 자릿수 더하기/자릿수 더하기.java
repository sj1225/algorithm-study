import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] array = Integer.toString(n).split("");
        
        for(int i=0;i<array.length;i++){
            answer += Integer.parseInt(array[i]);
        }
        
        return answer;
    }
}