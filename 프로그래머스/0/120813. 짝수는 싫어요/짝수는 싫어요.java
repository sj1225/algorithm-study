class Solution {
    public int[] solution(int n) {
        int[] answer = new int[Math.round((float)n/2)];
        
        int v = 0;
        for(int i=1;i<=n;i+=2){
            answer[v] = i;
            v++;
        }
        
        return answer;
    }
}