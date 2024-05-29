import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++){
            int c1 = commands[i][0];
            int c2 = commands[i][1];
            int c3 = commands[i][2];
            
            int[] temp = Arrays.copyOfRange(array, c1-1, c2);
            Arrays.sort(temp);
            answer[i] = temp[c3-1];
        }
        
        return answer;
    }
}