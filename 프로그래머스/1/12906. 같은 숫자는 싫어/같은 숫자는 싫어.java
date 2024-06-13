import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        int lastVal = -1;
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(lastVal == arr[i]) continue;
            lastVal = arr[i];
            answer.add(arr[i]);
        }
        
        return answer;
    }
}