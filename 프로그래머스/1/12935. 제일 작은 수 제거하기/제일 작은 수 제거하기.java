import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = Arrays.stream(arr).filter(a -> a != min).toArray();
        return answer.length == 0 ? new int[]{-1} : answer ;
    }
}