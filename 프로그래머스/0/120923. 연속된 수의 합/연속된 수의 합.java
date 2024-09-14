import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        if(num == 1) return new int[]{total};
        
        // 등차수열 공식(a는 첫번째 수)
        // total = num * (2 * a + (num - 1)) / 2
        int a = (total * 2 / num  + 1 - num) / 2 ;
        
        int[] answer = new int[num];
        Arrays.setAll(answer, i -> i + a);
        return answer;
    }
}