import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        Map<Integer, Boolean> points = new HashMap<>();
        
        // 겹치는 지점 구하기
        for(int i=0;i<lines.length;i++){
            int a1 = lines[i%3][0];
            int b1 = lines[i%3][1];
            int a2 = lines[(i+1)%3][0];
            int b2 = lines[(i+1)%3][1];
            
            // 겹치지 않는 경우
            if(a1 >= b2 || b1 <= a2){
                continue;
            }
            
            int point1 = Math.max(a1, a2);
            int point2 = Math.min(b1, b2);
            
            for(int j=point1;j<point2;j++){
                points.putIfAbsent(j, true);
            }
        }
        
        answer = points.size();
        
        return answer;
    }
}