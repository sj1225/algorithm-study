import java.util.*;

class Solution {
    public String solution(String s) {
        // 입력값을 숫자 배열로 변환
        String[] l = s.split(" ");
        int[] n = Arrays.stream(l).mapToInt(Integer::parseInt).toArray();
        
        // 배열의 최대값, 최소값 구함
        Arrays.sort(n);
        int max = n[n.length-1];
        int min = n[0];
        
        // 결과값 반환
        return min + " " + max;
    }
}