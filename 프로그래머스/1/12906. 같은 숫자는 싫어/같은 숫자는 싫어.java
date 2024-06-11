import java.util.*;
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int lastVal = -1;
        List<Integer> tempAnswer = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(lastVal == arr[i]) continue;
            lastVal = arr[i];
            tempAnswer.add(arr[i]);
        }
        
        int[] answer = new int[tempAnswer.size()];
        for(int i=0;i<tempAnswer.size();i++){
            answer[i] = tempAnswer.get(i);
        }
        
        return answer;
    }
}